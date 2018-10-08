/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Cabeza;
import Productos.Cola;
import Productos.Cuerpo;
import Productos.Patas;

/**
 *
 * @author NATA
 */
public abstract class Peluche {
    
    public abstract Cabeza crearCabeza();
    public abstract Cuerpo crearCuerpo();
    public abstract Cola crearCola();
    public abstract Patas crearPatas();
    
}
