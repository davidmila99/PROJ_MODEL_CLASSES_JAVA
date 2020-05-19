/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

/**
 *
 * @author David
 */
public class Categoria {
    private Long id;
    private String nom;
    private Categoria catPare;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Categoria(Long id, String nom, Categoria catPare) {
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
