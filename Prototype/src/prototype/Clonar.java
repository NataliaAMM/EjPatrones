/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import Objetos.Foto;
import java.util.Scanner;

/**
 *
 * @author NATA
 */
public class Clonar {

    public Clonar() {
        Scanner sc = new Scanner(System.in);
        Creador foto = new Creador();
        System.out.print("¿Cuantas fotos desea crear?: ");
        int cantidad = sc.nextInt();
        Foto [] fotos = new Foto[cantidad];
        for(int i = 0; i < cantidad; i++){
            fotos[i] = foto.copiarFoto();
        }
        for(int i = 1; i <= cantidad; i++){
            System.out.println("Copia "+i+": "+fotos[i-1].getInfo());
        }
        
    }
    
}
