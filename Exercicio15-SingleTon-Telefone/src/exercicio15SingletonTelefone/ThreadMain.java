/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15SingletonTelefone;

/**
 *
 * @author davidpvilaca
 */
public class ThreadMain implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + ++Estado.threads + " processando");
        int i;
        for (i =0; i < 100; i++) {
            TelefoneGenerator.INSTANCE.nextTel();
            TelefoneGenerator.INSTANCE.nextCel();
        }
    }
    
}
