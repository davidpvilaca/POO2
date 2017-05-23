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
public class CaixaPublicacao extends Observable {
    private String mensagem;
    
    public CaixaPublicacao() {
        this.addObserver(new Twitter());
        this.addObserver(new Blog());
        this.addObserver(new Facebook());
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        this.notifyObserver();
    }
}
