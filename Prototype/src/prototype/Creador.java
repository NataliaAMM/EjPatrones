/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import Objetos.Foto;

/**
 *
 * @author NATA
 */
public class Creador {
    private Foto foto = new Foto();

    public Creador() {
        foto.setFecha("30-08-18");
        foto.setObjetivo("Paisaje");
    }
    
    public Foto copiarFoto(){
        return (Foto) foto.clone();
    }
    
}
