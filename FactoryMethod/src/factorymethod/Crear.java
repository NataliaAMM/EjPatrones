/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import Creadores.Ave;
import Creadores.CreadorAnimales;
import Creadores.Mamifero;
import Productos.Cuerpo;
import java.util.Scanner;

/**
 *
 * @author NATA
 */
public class Crear {
    
    CreadorAnimales animal;
    Cuerpo cuerpo;
    
    public Crear() {
        System.out.println("Animales:");
        System.out.println("  1. Ave");
        System.out.println("  2. Mamifero");
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Ingrese el numero de su opción");
            opc = sc.nextInt();
        } while (opc < 1 || opc > 2);
        switch (opc) {
            case 1:
                animal = new Ave();
                System.out.println(" Ave:");
            break;
            case 2:
                animal = new Mamifero();
                System.out.println(" Mamifero:");
            break;
            default:
            break;
        }
        cuerpo = animal.crearCuerpo();
        System.out.println(cuerpo.crear());
    }
    
}
