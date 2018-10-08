/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Iterator;

/**
 *
 * @author NATA
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaCarritos fabrica = new FabricaCarritos();
        fabrica.construirJuguete();
        
        Juguete juguete = fabrica.getJuguete();
        Iterator itPCuerpo = juguete.getPcuerpo().listIterator();
        Iterator itRuedas = juguete.getRuedas().listIterator();
        
        System.out.println("Construir un carrito:");
        
        while(itPCuerpo.hasNext()){
            System.out.println(" -Se añade: "+itPCuerpo.next());
        }
        while(itRuedas.hasNext()){
            System.out.println(" -Se añade: "+itRuedas.next());
        }
    }
    
}
