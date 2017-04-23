/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23FabricaBridgeArquivos;

import FabricaPersistencia.FabricaPersistencia;
import FabricaPersistencia.Persistencia;
import FabricaPersistencia.PersistenciaDeDados;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    public static void main(String[] args) {
        PersistenciaDeDados implementor;
        if(databaseDriverExists()){
            implementor = FabricaPersistencia.getImplementor("DataBase");
        }else{
            implementor = FabricaPersistencia.getImplementor("FileSystem");
        }
        Persistencia persistenceAPI = FabricaPersistencia.getPersist(implementor);
        persistenceAPI.salvar(new Object());
    }
    
    /**
     * Retorna se existe um driver de banco de dados ou não
     * @return
     */
    private static boolean databaseDriverExists() {
        return ThreadLocalRandom.current().nextInt(0, 10) < 5;
    }
    
}
