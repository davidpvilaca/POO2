/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio22Bridgearquivos;

/**
 *
 * @author davidpvilaca
 */
public class FileSystem implements PersistenciaDeDados {

    @Override
    public void salvar(Object obj) {
        System.out.println("Salvar FileSystem: " + obj.getClass());
    }
    
}
