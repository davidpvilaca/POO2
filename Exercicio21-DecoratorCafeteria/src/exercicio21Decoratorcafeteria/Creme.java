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
public class Creme extends Adicional {

    public Creme(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double coast() {
        return 1 + this.bebida.coast();
    }

    @Override
    public String name() {
        return this.bebida.name() + " + Creme";
    }
    
}
