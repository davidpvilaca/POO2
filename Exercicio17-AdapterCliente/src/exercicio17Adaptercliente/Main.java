/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17Adaptercliente;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalvaCliente salva = new SalvaCliente();
        // Criando ClienteS2 pra simular uma instância externa
        ClienteS2 c2 = new ClienteS2();
        c2.setCelular("1111");
        c2.setDddCelular("027");
        c2.setTelefone("3333");
        c2.setDddTelefone("027"); 
        c2.setEmail("email"); 
        c2.setNome("jose"); 
        c2.setSobreNome("Silva");
        // Adaptando instancia externa
        AdapterClienteS2 cliente = new AdapterClienteS2(c2);
        salva.salva(cliente);
    }
    
}
