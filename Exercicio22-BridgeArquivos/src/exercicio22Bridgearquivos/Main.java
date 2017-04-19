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
public class Main {
    public static void main(String[] args) {
    PersistenciaDeDados implementor = null;
    if(databaseDriverExists()){
        implementor = new DataBase();
    }else{
        implementor = new FileSystem(); 
    }
        Persistencia persistenceAPI = new ImplementacaoPersistencia(implementor);
        persistenceAPI.salvar(new Object());
    }

    private static boolean databaseDriverExists() {
        return false;
    }
}
