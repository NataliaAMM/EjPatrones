/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creadores;

import Productos.Cuerpo;
import Productos.CuerpoAve;

/**
 *
 * @author NATA
 */
public class Ave extends CreadorAnimales{

    @Override
    public Cuerpo factoryMethod() {
        return new CuerpoAve();
    }
    
}
