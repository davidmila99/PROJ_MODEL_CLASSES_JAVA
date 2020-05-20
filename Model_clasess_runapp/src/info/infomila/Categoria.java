/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {
    @Id
    @Column(name = "cat_id")
    private Integer id;
    @Column(name = "cat_nom",length = 35,nullable=false)
    private String nom;
    @Basic(optional = true)
    @Column(name = "cat_pare",nullable = true)
    @OneToMany(mappedBy = "Categoria")
    private Categoria catPare;
    @OneToMany(mappedBy = "Categoria",fetch = FetchType.LAZY)
    @JoinColumn(insertable = true,updatable = true)
    private List<Ruta> rutesCat = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id < 0 ||id == null){
            throw new RunAppException("El id ha de ser positiu");
        }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null){
            throw new RunAppException("El nom es obligatori");
        }
        this.nom = nom;
    }

    public Categoria getCatPare() {
        return catPare;
    }

    public void setCatPare(Categoria catPare) {
        this.catPare = catPare;
    }

    public Categoria(Integer id, String nom, Categoria catPare) {
        setId(id);
        setNom(nom);
        setCatPare(catPare);
    }

    public Categoria() {
    }

    @Override
    public String toString() {
        return "Cateogoria{" + "id=" + id + ", nom=" + nom + ", catPare=" + catPare.toString() + '}';
    }
    
    
    
    
}
