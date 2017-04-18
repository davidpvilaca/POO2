/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio21Decoratorcafeteria;

/**
 *
 * @author davidpvilaca
 */
public abstract class Adicional extends Bebida {

    protected final Bebida bebida;
    
    public Adicional(Bebida bebida) {
        this.bebida = bebida;
    }
    
}
