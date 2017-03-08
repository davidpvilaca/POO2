/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5.pizza;

/**
 *
 * @author davidpvilaca
 */
public class PizzaFactory {
    public static Pizza createPizza(String name) {
        Pizza pizza = null;
        switch (name.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                System.out.println("Pizza não encontrada!");
        }
        return pizza;
    }
}
