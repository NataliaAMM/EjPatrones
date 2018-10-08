/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author NATA
 */
public class FabricaCarritos {
    
    Juguete juguete;
    
    public void construirJuguete(){
        juguete = new Juguete();
        costruirRuedas();
        conPCuerpo();
    }
    
    public void costruirRuedas(){
        juguete.nuevaRueda("rueda inferior-derecha");
        juguete.nuevaRueda("rueda inferior-izquierda");
        juguete.nuevaRueda("rueda superior-derecha");
        juguete.nuevaRueda("rueda superior-izquierda");
    }
    
    public void conPCuerpo(){
        juguete.nuevaPCuerpo("Chasis");
        juguete.nuevaPCuerpo("vidrios");
        juguete.nuevaPCuerpo("Espejos");
    }

    Juguete getJuguete() {
        return juguete;
    }
}
