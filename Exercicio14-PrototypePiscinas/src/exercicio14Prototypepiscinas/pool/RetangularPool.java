/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14Prototypepiscinas.pool;

/**
 *
 * @author davidpvilaca
 */
public class RetangularPool extends Pool implements Cloneable {
    private Escada escada;

    public Escada getEscada() {
        return escada;
    }

    public void setEscada(Escada escada) {
        this.escada = escada;
    }
    
    public RetangularPool clone() {
        RetangularPool obj = null;
        obj = (RetangularPool)super.clone();
        obj.setEscada(this.escada);
        return obj;
    }
}
