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
public class Blog implements Observer {

    @Override
    public void update(Observable obs) {
        System.out.println("Publicando no Blog a mensagem \"" + ((CaixaPublicacao)obs).getMensagem() + "\"");
    }
    
}
