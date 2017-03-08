/* Pizza
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import exercicio5.pizza.Pizza;
import exercicio5.pizza.PizzaFactory;

/**
 *
 * @author davidpvilaca
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza1 = PizzaFactory.createPizza("cheese");
        pizza1.prepere();
        pizza1.bake();
        pizza1.cut();
        pizza1.box();
    }
    
}
