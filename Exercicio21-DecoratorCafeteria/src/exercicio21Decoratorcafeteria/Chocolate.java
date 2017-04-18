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
public class Chocolate extends Adicional {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double coast() {
        return 2 + this.bebida.coast();
    }

    @Override
    public String name() {
        return this.bebida.name() + " + Chocolate";
    }
    
}
