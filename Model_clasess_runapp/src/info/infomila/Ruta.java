/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 *
 * @author David
 */
@Embeddable
public class Ruta implements Serializable{
    
    @Column(name = "rut_id")
    private Integer id;
    @Column(name = "rut_titol",length = 35,nullable = false)
    private String titol;
    //@Column(name = "rut_desc_markdown",nullable = false)
    @Transient
    private String descMarkDown;
    @Transient
    private Float desnivell;
    @Transient
    private Float alcadaMax;
    @Transient
    private Float alcadaMin;
    @Transient
    private Float distanciaKm;
    @Transient
    private Timestamp temsAprox;
    @Transient
    private Boolean circular;
    @Transient
    private Float dificultat;
    @Transient
    private String urlGpx;
    @Transient
    private Foto fotoRuta;
    //@Transient
    //private List<Punt> puntsRuta = new ArrayList<>();
    @Transient
    private Categoria catPare;

    public Categoria getCatPare() {
        return catPare;
    }

    public void setCatPare(Categoria catPare) {
        if(catPare == null){
            throw new RunAppException("La categoria pare es obligatoria");
        }
        this.catPare = catPare;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id < 0 || id == null){
            throw new RunAppException("El id ha de ser positiu");
        }
        this.id = id;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        if(titol == null){
            throw new RunAppException("El titol es oblilgatori");
        }
        this.titol = titol;
    }

    public String getDescMarkDown() {
        return descMarkDown;
    }

    public void setDescMarkDown(String descMarkDown) {
        if(descMarkDown == null){
            throw new RunAppException("La descripcio es oblilgatoria");
        }
        this.descMarkDown = descMarkDown;
    }

    public Float getDesnivell() {
        return desnivell;
    }

    public void setDesnivell(Float desnivell) {
        if(desnivell == null){
            throw new RunAppException("El desnivell es oblilgatori");
        }
        this.desnivell = desnivell;
    }

    public Float getAlcadaMax() {
        return alcadaMax;
    }

    public void setAlcadaMax(Float alcadaMax) {
        if(alcadaMax == null){
            throw new RunAppException("La alcada maxima es obligatoria");
        }
        this.alcadaMax = alcadaMax;
    }

    public Float getAlcadaMin() {
        return alcadaMin;
    }

    public void setAlcadaMin(Float alcadaMin) {
        if(alcadaMin == null){
            throw new RunAppException("La alcada minima es obligatoria");
        }
        this.alcadaMin = alcadaMin;
    }

    public Float getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(Float distanciaKm) {
        if(distanciaKm < 0 || distanciaKm == null){
            throw new RunAppException("La distancia ha de ser positiva");
        }
        this.distanciaKm = distanciaKm;
    }

    public Timestamp getTemsAprox() {
        return temsAprox;
    }

    public void setTemsAprox(Timestamp temsAprox) {
        if(temsAprox == null){
            throw new RunAppException("El temps aproximat es obligatori");
        }
        this.temsAprox = temsAprox;
    }

    public Boolean isCircular() {
        return circular;
    }

    public void setCircular(Boolean circular) {
        if(circular == null){
            throw new RunAppException("Es obligatori di si es circular o no la ruta");
        }
        this.circular = circular;
    }

    public Float getDificultat() {
        return dificultat;
    }

    public void setDificultat(Float dificultat) {
        if(dificultat < 0 || dificultat > 10 || dificultat == null){
            throw new RunAppException("La dificultat ha de estar entre 0 i 10");
        }
        this.dificultat = dificultat;
    }

    public String getUrlGpx() {
        return urlGpx;
    }

    public void setUrlGpx(String urlGpx) {
        this.urlGpx = urlGpx;
    }

    public Foto getFotoRuta() {
        return fotoRuta;
    }

    public void setFotoRuta(Foto fotoRuta) {
        if(fotoRuta == null){
            throw new RunAppException("La foto de la ruta es obligatoria");
        }
        this.fotoRuta = fotoRuta;
    }
    public Ruta(Integer id, String titol, String descMarkDown, Float desnivell, Float alcadaMax, Float alcadaMin, Float distanciaKm, Timestamp temsAprox, Boolean circular, Float dificultat, String urlGpx, Foto fotoRuta) {
        setId(id);
        setTitol(titol);
        setDescMarkDown(descMarkDown);
        setDesnivell(desnivell);
        setAlcadaMax(alcadaMax);
        setAlcadaMin(alcadaMin);
        setDistanciaKm(distanciaKm);
        setTemsAprox(temsAprox);
        setCircular(circular);
        setDificultat(dificultat);
        setUrlGpx(urlGpx);
        setFotoRuta(fotoRuta);
    }

    public Ruta(Integer id, String titol, String descMarkDown, Float desnivell, Float alcadaMax, Float alcadaMin, Float distanciaKm, Timestamp temsAprox, Boolean circular, Float dificultat, String urlGpx, Foto fotoRuta, Categoria catPare) {
        this.id = id;
        this.titol = titol;
        this.descMarkDown = descMarkDown;
        this.desnivell = desnivell;
        this.alcadaMax = alcadaMax;
        this.alcadaMin = alcadaMin;
        this.distanciaKm = distanciaKm;
        this.temsAprox = temsAprox;
        this.circular = circular;
        this.dificultat = dificultat;
        this.urlGpx = urlGpx;
        this.fotoRuta = fotoRuta;
        this.catPare = catPare;
    }

    
    
    public Ruta() {
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", titol=" + titol + ", descMarkDown=" + descMarkDown + ", desnivell=" + desnivell + ", alcadaMax=" + alcadaMax + ", alcadaMin=" + alcadaMin + ", distanciaKm=" + distanciaKm + ", temsAprox=" + temsAprox + ", circular=" + circular + ", dificultat=" + dificultat + ", urlGpx=" + urlGpx + ", fotoRuta=" + fotoRuta + '}';
    }

    public Ruta(Integer id, String titol) {
        this.id = id;
        this.titol = titol;
    }

    public Ruta(Integer id, String titol, String descMarkDown, Float desnivell, Float alcadaMax, Float alcadaMin, Float distanciaKm, Boolean circular, Float dificultat, String urlGpx, Foto fotoRuta, Categoria catPare) {
        this.id = id;
        this.titol = titol;
        this.descMarkDown = descMarkDown;
        this.desnivell = desnivell;
        this.alcadaMax = alcadaMax;
        this.alcadaMin = alcadaMin;
        this.distanciaKm = distanciaKm;
        this.circular = circular;
        this.dificultat = dificultat;
        this.urlGpx = urlGpx;
        this.fotoRuta = fotoRuta;
        this.catPare = catPare;
    }
    
    
    
}
