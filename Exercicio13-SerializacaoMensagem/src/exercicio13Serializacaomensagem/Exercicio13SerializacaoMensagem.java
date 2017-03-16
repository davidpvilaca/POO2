/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13Serializacaomensagem;

/**
 *
 * @author davidpvilaca
 */
public class Exercicio13SerializacaoMensagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Serializando usuário
        System.out.println("========== USUÁRIO ==========");
        
        Usuario user = new Usuario();
        user.setNome("David");
        user.setEmail("david@vilaca.com");
        user.setSenha("123456");
        
        String nomeArquivo = "david.ser";
        
        Usuario.salvarSerializado(user, nomeArquivo);
        Usuario.lerSerializado(nomeArquivo);
        
        // Serializando mensagem
        System.out.println("========== MENSAGEM ==========");
        
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto("Mensagem serializada!");
        
        nomeArquivo = "mensagem1.ser";
        
        Mensagem.salvarSerializado(mensagem, nomeArquivo);
        Mensagem.lerSerializado(nomeArquivo);
        
    }
    
}
