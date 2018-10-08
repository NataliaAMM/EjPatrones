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
public class Conejo {

    Unico bonny;
    Unico snowball;
    
    public Conejo() {
        bonny = Unico.getInstancia("Bonny", "negro");
        snowball = Unico.getInstancia("Snowball", "blanco");
        
        System.out.println("Bonny tiene nombre: "+bonny.getNombre()+" y es de color: "+bonny.getColor()+".");
        System.out.println("Snowball tiene nombre: "+snowball.getNombre()+" y es de color: "+snowball.getColor()+".");
    }
    
}
