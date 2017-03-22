/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15SingletonTelefone;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Iniciando threads
        for (int i = 0; i < 10; i++) usingThread();
        
        try {
            // Aguardando um tempo estimado para término das threads
            // Falta de conhecimento em fazer algo melhor =D
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("===== CELULARES ===== ");
        for (int j = 0; j < Estado.celulares.size(); j++) System.out.println(Estado.celulares.get(j));
        System.out.println("===== TELEFONES FIXO ===== ");
        for (int k = 0; k < Estado.telFixos.size(); k++) System.out.println(Estado.telFixos.get(k));
    }
    
    public static void usingThread() {
        Runnable run = new ThreadMain();
        Thread thread = new Thread(run);
        thread.start();
    }
    
}
