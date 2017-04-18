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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Expresso com chocolate e creme
        Bebida bebida1 = new Expresso();
        bebida1 = new Creme(bebida1);
        bebida1 = new Chocolate(bebida1);
        System.out.println("Bebida: " + bebida1.name());
        System.out.println("Valor: " + bebida1.coast());
        
        // Cappuccino com chocolate
        Bebida bebida2 = new Cappuccino();
        bebida2 = new Chocolate(bebida2);
        System.out.println("Bebida: " + bebida2.name());
        System.out.println("Valor: " + bebida2.coast());
    }
    
}
