/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio25Posterous;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CaixaPublicacao caixa = new CaixaPublicacao();
        caixa.setMensagem("Mensagem 1");
        System.out.println("-======================-");
        caixa.setMensagem("Mensagem 2");
        System.out.println("-======================-");
        caixa.setMensagem("Mensagem 3");
    }
    
}
