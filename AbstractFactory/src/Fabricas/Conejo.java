/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Cabeza;
import Productos.CabezaConejo;
import Productos.Cola;
import Productos.ColaConejo;
import Productos.Cuerpo;
import Productos.CuerpoConejo;
import Productos.Patas;
import Productos.PatasConejo;

/**
 *
 * @author NATA
 */
public class Conejo extends Peluche{

    @Override
    public Cabeza crearCabeza() {
        return new CabezaConejo();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoConejo();
    }

    @Override
    public Cola crearCola() {
        return new ColaConejo();
    }

    @Override
    public Patas crearPatas() {
        return new PatasConejo();
    }
    
}
