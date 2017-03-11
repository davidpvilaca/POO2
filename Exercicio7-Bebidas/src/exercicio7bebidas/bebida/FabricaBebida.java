/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7bebidas.bebida;

/**
 *
 * @author davidpvilaca
 */
public class FabricaBebida {
    public Bebida criarBebida(String tipo) {
        Bebida bebida = null;
        tipo = tipo.toLowerCase();
        if (tipo == "suco") {
            bebida = new Suco();
        } else if (tipo == "cafe") {
            bebida = new Cafe();
        } else if (tipo == "cha") {
            bebida = new Cha();
        } else if (tipo == "refrigerante") {
            bebida = new Refrigerante();
        } else {
            System.out.println("Bebida não encontrada!");
        }
        return bebida;
    }
}
