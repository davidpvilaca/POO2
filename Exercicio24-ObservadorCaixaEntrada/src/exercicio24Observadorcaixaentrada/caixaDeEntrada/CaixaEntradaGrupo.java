/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio24Observadorcaixaentrada.caixaDeEntrada;

/**
 *
 * @author davidpvilaca
 */
public class CaixaEntradaGrupo extends Observable {
    private String mensagem;
        
    public CaixaEntradaGrupo() {
        this.addObserver(new MembroEmail());
        this.addObserver(new MembroWhatsApp());
    }
    
    public void setNovaMensagem(String mensagem) {
        this.mensagem = mensagem;
        this.notifyObserver();
    }
    
    public String getMensagem() {
        return this.mensagem;
    }
    
}
