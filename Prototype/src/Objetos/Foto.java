/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author NATA
 */
public class Foto implements Cloneable {
    String objetivo;
    String fecha;

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getInfo(){
        return "Objetivo: "+objetivo+" Fecha: "+fecha;
    }
    
    public Foto clone(){
        Foto fotoClonada = null;
        try {
            fotoClonada = (Foto) super.clone();
            fotoClonada.setObjetivo(objetivo);
            fotoClonada.setFecha(fecha);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return fotoClonada;
    }
    
}
