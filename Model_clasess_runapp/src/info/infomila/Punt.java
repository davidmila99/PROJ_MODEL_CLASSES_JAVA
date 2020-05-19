/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.util.Date;

/**
 *
 * @author David
 */
public class Punt {

    private Integer numero;
    private String nom;
    private String desc;
    private Date hora;
    private Double lat;
    private Double longitud;
    private Double elevacio;
    private Foto puntFoto;
    
    public Foto getPuntFoto() {
        return puntFoto;
    }

    public void setPuntFoto(Foto puntFoto) {
        if(puntFoto == null){
            throw new RunAppException("La fot es obligatoria");
        }
        this.puntFoto = puntFoto;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if(numero < 0 || numero == null){
            throw new RunAppException("El numeor del punt ha de ser positiu");
        }
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom == null){
            throw new RunAppException("El nom es obligatori");
        }
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        if(desc == null){
            throw new RunAppException("La descripcio es obligatoria");
        }
        this.desc = desc;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        if(hora == null){
            throw new RunAppException("La hora es obligatoria");
        }
        this.hora = hora;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        if(lat == null){
            throw new RunAppException("La latitud no pot ser nula");
        }
        this.lat = lat;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        if(longitud == null){
            throw new RunAppException("La longitud no pot ser nula");
        }
        this.longitud = longitud;
    }

    public Double getElevacio() {
        return elevacio;
    }

    public void setElevacio(Double elevacio) {
        if(longitud == null){
            throw new RunAppException("La elevacio no pot ser nula");
        }
        this.elevacio = elevacio;
    }
    
    public Punt(Integer numero, String nom, String desc, Date hora, Double lat, Double longitud, Double elevacio,Foto puntFoto) {
        setNumero(numero);
        setNom(nom);
        setDesc(desc);
        setHora(hora);
        setLat(lat);
        setLongitud(longitud);
        setElevacio(elevacio);
        setPuntFoto(puntFoto);
    }

    public Punt() {
    }

    @Override
    public String toString() {
        return "Punt{" + "numero=" + numero + ", nom=" + nom + ", desc=" + desc + ", hora=" + hora + ", lat=" + lat + ", longitud=" + longitud + ", elevacio=" + elevacio + ", puntFoto=" + puntFoto + '}';
    }

    
    
    
    
    
}
