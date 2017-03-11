/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7bebidas;

import exercicio7bebidas.bebida.Bebida;
import exercicio7bebidas.bebida.FabricaBebida;

/**
 *
 * @author davidpvilaca
 */
public class Exercicio7Bebidas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaBebida fabricaBebida = new FabricaBebida();
        Bebida suco = fabricaBebida.criarBebida("suco");
        Bebida cafe = fabricaBebida.criarBebida("cafe");
        Bebida cha = fabricaBebida.criarBebida("cha");
        Bebida refrigerante = fabricaBebida.criarBebida("refrigerante");
        System.out.println(suco.getClass());
        System.out.println(cafe.getClass());
        System.out.println(cha.getClass());
        System.out.println(refrigerante.getClass());
    }
    
}
