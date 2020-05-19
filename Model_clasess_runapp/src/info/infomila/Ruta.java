/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author David
 */
public class Ruta {
    private long id;
    private String titol;
    private String descMarkDown; 
    private float desnivell;
    private float alcadaMax;
    private float alcadaMin;
    private float distanciaKm;
    private Date temsAprox;
    private boolean circular;
    private float dificultat;
    private String urlGpx;
    private Foto fotoRuta;
    private List<Punt> puntsRuta = new ArrayList<>();
    private List<Categoria> catRuta = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id < 0){
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

    public float getDesnivell() {
        return desnivell;
    }

    public void setDesnivell(float desnivell) {
        this.desnivell = desnivell;
    }

    public float getAlcadaMax() {
        return alcadaMax;
    }

    public void setAlcadaMax(float alcadaMax) {
        this.alcadaMax = alcadaMax;
    }

    public float getAlcadaMin() {
        return alcadaMin;
    }

    public void setAlcadaMin(float alcadaMin) {
        this.alcadaMin = alcadaMin;
    }

    public float getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(float distanciaKm) {
        if(distanciaKm < 0){
            throw new RunAppException("La distancia ha de ser positiva");
        }
        this.distanciaKm = distanciaKm;
    }

    public Date getTemsAprox() {
        return temsAprox;
    }

    public void setTemsAprox(Date temsAprox) {
        if(temsAprox == null){
            throw new RunAppException("El temps aproximat es obligatori");
        }
        this.temsAprox = temsAprox;
    }

    public boolean isCircular() {
        return circular;
    }

    public void setCircular(boolean circular) {
        this.circular = circular;
    }

    public float getDificultat() {
        return dificultat;
    }

    public void setDificultat(float dificultat) {
        if(dificultat < 0 || dificultat > 10){
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

    public List<Punt> getPuntsRuta() {
        return puntsRuta;
    }

    public void setPuntsRuta(List<Punt> puntsRuta) {
        if(puntsRuta == null || puntsRuta.size() == 0){
            throw new RunAppException("Els punts de la ruta no poden ser nul i ha de tenir un punt com a minim");
        }
        this.puntsRuta = puntsRuta;
    }

    public List<Categoria> getCatRuta() {
        return catRuta;
    }

    public void setCatRuta(List<Categoria> catRuta) {
        if(catRuta == null || catRuta.size() == 0){
            throw new RunAppException("Ha de tenir minim una categoria");
        }
        this.catRuta = catRuta;
    }

    public Ruta(long id, String titol, String descMarkDown, float desnivell, float alcadaMax, float alcadaMin, float distanciaKm, Date temsAprox, boolean circular, float dificultat, String urlGpx, Foto fotoRuta, List<Punt> puntsRuta, List<Categoria> catRuta) {
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
        setPuntsRuta(puntsRuta);
        setCatRuta(catRuta);
    }

    public Ruta() {
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", titol=" + titol + ", descMarkDown=" + descMarkDown + ", desnivell=" + desnivell + ", alcadaMax=" + alcadaMax + ", alcadaMin=" + alcadaMin + ", distanciaKm=" + distanciaKm + ", temsAprox=" + temsAprox + ", circular=" + circular + ", dificultat=" + dificultat + ", urlGpx=" + urlGpx + ", fotoRuta=" + fotoRuta + ", puntsRuta=" + puntsRuta + ", catRuta=" + catRuta + '}';
    }
    
    
    
}
