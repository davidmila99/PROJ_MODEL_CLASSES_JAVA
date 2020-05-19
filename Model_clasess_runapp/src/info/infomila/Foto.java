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
public class Foto {
    
    private String urlFoto;
    private String titolFoto;
    
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

    @Override
    public String toString() {
        return "Foto{" + "urlFoto=" + urlFoto + ", titolFoto=" + titolFoto + '}';
    }
    
    
    
    
}
