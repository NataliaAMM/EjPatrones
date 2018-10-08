/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Fabricas.Conejo;
import Fabricas.Jirafa;
import Fabricas.Peluche;
import Fabricas.Vaca;
import Productos.Cabeza;
import Productos.Cola;
import Productos.Cuerpo;
import Productos.Patas;
import java.util.Scanner;

/**
 *
 * @author NATA
 */
public class CrearPeluches {

    Peluche peluche;
    Cabeza cabeza;
    Cuerpo cuerpo;
    Cola cola;
    Patas patas;
    
    public CrearPeluches() {
        System.out.println("Peluches:");
        System.out.println("  1. Conejo");
        System.out.println("  2. Jirafa");
        System.out.println("  3. Vaca");
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Ingrese el numero de su opción");
            opc = sc.nextInt();
        } while (opc < 1 || opc > 3);
        switch (opc) {
            case 1:
                peluche = new Conejo();
                System.out.println(" Conejo:");
            break;
            case 2:
                peluche = new Jirafa();
                System.out.println(" Jirafa:");
            break;
            case 3:
                peluche = new Vaca();
                System.out.println(" Vaca:");
            break;
            default:
            break;
        }
        
        cabeza = peluche.crearCabeza();
        cuerpo = peluche.crearCuerpo();
        cola = peluche.crearCola();
        patas = peluche.crearPatas();
        
        System.out.println(cabeza.crear());
        System.out.println(cuerpo.crear());
        System.out.println(cola.crear());
        System.out.println(patas.crear());
    }
}
