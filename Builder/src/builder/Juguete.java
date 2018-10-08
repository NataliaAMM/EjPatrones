/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;

/**
 *
 * @author NATA
 */
public class Juguete {
    private ArrayList<String> ruedas = new ArrayList<String>();
    private ArrayList<String> pcuerpo = new ArrayList<String>();

    public void nuevaRueda(String r){
        ruedas.add(r);
    }
    
    public void nuevaPCuerpo(String p){
        pcuerpo.add(p);
    }

    public ArrayList<String> getRuedas() {
        return ruedas;
    }

    public ArrayList<String> getPcuerpo() {
        return pcuerpo;
    }
    
}
