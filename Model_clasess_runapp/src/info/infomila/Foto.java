/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author David
 */
//@Entity
//@Table(name = "Foto")
public class Foto {
    
    //@Id
    //@Column(name = "foto_id")
    private Integer id;
    //@Column(name = "foto_url", nullable=false)
    private String urlFoto;
    //@Column(name = "foto_titol",length = 15)
    private String titolFoto;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id == null || id < 0){
            throw new RunAppException("El id es obligatori i ha de ser positiu");
        }
        this.id = id;
    }
    
    
    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        if(urlFoto==null){
            throw new RunAppException("La foto es obligatoria");
        }
        this.urlFoto = urlFoto;
    }

    public String getTitolFoto() {
        return titolFoto;
    }

    public void setTitolFoto(String titolFoto) {
        this.titolFoto = titolFoto;
    }

    public Foto() {
    }

    public Foto(String urlFoto, String titolFoto) {
        setUrlFoto(urlFoto);
        setTitolFoto(titolFoto);
    }

    public Foto(Integer id,String urlFoto, String titolFoto) {
        setId(id);
        setUrlFoto(urlFoto);
        setTitolFoto(titolFoto);
    }
    
    @Override
    public String toString() {
        return "Foto{" + "urlFoto=" + urlFoto + ", titolFoto=" + titolFoto + '}';
    }
    
    
    
    
}
