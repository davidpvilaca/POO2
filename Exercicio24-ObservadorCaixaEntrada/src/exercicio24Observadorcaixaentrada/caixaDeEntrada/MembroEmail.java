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
public class MembroEmail implements Observer {
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable obs) {
        System.out.println("Notify MembroEmail class");
        System.out.println("Message: " + ((CaixaEntradaGrupo)obs).getMensagem());
    }
    
}
