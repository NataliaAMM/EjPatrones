/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author NATA
 */
public class Unico {
    
    public static Unico con;
    String nombre;
    String color;

    public Unico(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public static Unico getInstancia(String nombre, String color) {
        if (con == null) {
            con = new Unico(nombre,color);
        }
        return con;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
    
}
