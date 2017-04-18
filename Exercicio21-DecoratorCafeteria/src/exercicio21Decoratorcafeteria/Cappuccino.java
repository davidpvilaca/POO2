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
public class Cappuccino extends Bebida {

    @Override
    public double coast() {
        return 6;
    }

    @Override
    public String name() {
        return "Cappuccino";
    }
    
}
