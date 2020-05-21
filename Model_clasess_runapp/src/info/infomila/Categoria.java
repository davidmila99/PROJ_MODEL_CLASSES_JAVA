/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(insertable = true, updatable = true)
    private List<Categoria> catFilles;
    @ElementCollection
    @CollectionTable(name = "Ruta",
            joinColumns = @JoinColumn(name = "rut_cat",
                    foreignKey = @ForeignKey(name = "FK_RUTCAT_CAT")))
    private List<Ruta> rutesCat;

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



    public Categoria(Integer id, String nom) {
        setId(id);
        setNom(nom);
        rutesCat = new ArrayList<>();
        catFilles = new ArrayList<>();
    }

    public Categoria() {
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
      
    public int getRutesCount(){
        return catFilles.size();
    }

    public Ruta getRuta(int index){
        return rutesCat.get(index);
    }

    public Iterator<Ruta> getRutes(){
        return rutesCat.iterator();
    }

    public void addRuta(Ruta r){
        rutesCat.add(r);
    }

    public Ruta deleteRuta(int index){
        return rutesCat.remove(index);
    }

    public void deleteRuta(Ruta r){
        rutesCat.remove(r);
    }
    
    
    public int getCatFillesCount(){
        return catFilles.size();
    }

    public Categoria getCatFilla(int index){
        return catFilles.get(index);
    }

    public Iterator<Categoria> getCatFilles(){
        return catFilles.iterator();
    }

    public void addCatFilla(Categoria filla){
        catFilles.add(filla);
    }

    public Categoria deleteCatFilla(int index){
        return catFilles.remove(index);
    }

    public void deleteCatFilla(Categoria filla){
        catFilles.remove(filla);
    }



}
