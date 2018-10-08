/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creadores;

import Productos.Cuerpo;

/**
 *
 * @author NATA
 */
public abstract class CreadorAnimales {
    public Cuerpo crearCuerpo(){
        return factoryMethod();
    }
    
    public abstract Cuerpo factoryMethod();
}
