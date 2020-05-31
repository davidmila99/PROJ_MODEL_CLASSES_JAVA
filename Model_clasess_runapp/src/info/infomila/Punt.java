/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.sql.Timestamp;

/**
 *
 * @author David
 */
//@Entity
//@Table(name = "Punt")
//@IdClass(PuntID.class)
public class Punt {

    //@Id
    //@Column(name = "punt_numero")
    private Integer numero;
    //@Id
    //@Column(name = "punt_ruta")
    private Integer rutId;
    //@Column(name = "punt_nom",length=255,nullable=false)
    private String nom;
    //@Column(name = "punt_desc",nullable=false)
    private String desc;
    //@Column(name = "punt_hora",nullable=false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Long hora;
    //@Column(name = "punt_lat",nullable=false)
    private Double lat;
    //@Column(name = "punt_long",nullable=false)
    private Double longitud;
    //@Column(name = "punt_elevacio",nullable=false)
    private Double elevacio;
    //@Column(name = "punt_elevacio",nullable=false)
    //ManyToOne
    private Foto puntFoto;
    
    
    public Integer getRutId() {
        return rutId;
    }

    public void setRutId(Integer rutId) {
        if(rutId == null || rutId < 0){
            throw new RunAppException("Ha de ser positiu i existent");
        }
        this.rutId = rutId;
    }
    
    
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

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
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
    
    public Punt(Integer numero,String nom, String desc, Long hora, Double lat, Double longitud, Double elevacio,Foto puntFoto) {
        setNumero(numero);
        setNom(nom);
        setDesc(desc);
        setHora(hora);
        setLat(lat);
        setLongitud(longitud);
        setElevacio(elevacio);
        setPuntFoto(puntFoto);
    }

    public Punt(Integer numero, Integer rutId, String nom, String desc, Double lat, Double longitud, Double elevacio, Foto puntFoto) {
        this.numero = numero;
        this.rutId = rutId;
        this.nom = nom;
        this.desc = desc;
        this.lat = lat;
        this.longitud = longitud;
        this.elevacio = elevacio;
        this.puntFoto = puntFoto;
    }

    public Punt(Integer numero, Integer rutId, String nom, String desc, Long hora, Double lat, Double longitud, Double elevacio, Foto puntFoto) {
        this.numero = numero;
        this.rutId = rutId;
        this.nom = nom;
        this.desc = desc;
        this.hora = hora;
        this.lat = lat;
        this.longitud = longitud;
        this.elevacio = elevacio;
        this.puntFoto = puntFoto;
    }
    
    
    
    

    public Punt() {
    }

    @Override
    public String toString() {
        return "Punt{" + "numero=" + numero + ", nom=" + nom + ", desc=" + desc + ", hora=" + hora + ", lat=" + lat + ", longitud=" + longitud + ", elevacio=" + elevacio + ", puntFoto=" + puntFoto + '}';
    }

    
    
    
    
    
}
