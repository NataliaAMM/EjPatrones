/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Cabeza;
import Productos.CabezaJirafa;
import Productos.Cola;
import Productos.ColaJirafa;
import Productos.Cuerpo;
import Productos.CuerpoJirafa;
import Productos.Patas;
import Productos.PatasJirafa;

/**
 *
 * @author NATA
 */
public class Jirafa extends Peluche{

    @Override
    public Cabeza crearCabeza() {
        return new CabezaJirafa();
    }

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoJirafa();
    }

    @Override
    public Cola crearCola() {
        return new ColaJirafa();
    }

    @Override
    public Patas crearPatas() {
        return new PatasJirafa();
    }
    
}
