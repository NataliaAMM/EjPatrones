/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Cabeza;
import Productos.CabezaVaca;
import Productos.Cola;
import Productos.ColaVaca;
import Productos.Cuerpo;
import Productos.CuerpoVaca;
import Productos.Patas;
import Productos.PatasVaca;

/**
 *
 * @author NATA
 */
public class Vaca extends Peluche{

    @Override
    public Cabeza crearCabeza() {
        return new CabezaVaca();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoVaca();
    }

    @Override
    public Cola crearCola() {
        return new ColaVaca();
    }

    @Override
    public Patas crearPatas() {
        return new PatasVaca();
    }
    
}
