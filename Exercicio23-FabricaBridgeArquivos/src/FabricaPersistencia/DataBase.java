/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaPersistencia;

/**
 *
 * @author davidpvilaca
 */
public class DataBase implements PersistenciaDeDados {

    @Override
    public void salvar(Object obj) {
        System.out.println("Salvar DataBase: " + obj.getClass());
    }
    
}
