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
public class FabricaPersistencia {
    /**
     * Retorna uma instância de implementor dado seu nome como parâmetro
     * @param name
     * @return 
     */
    public static PersistenciaDeDados getImplementor(String name) {
        PersistenciaDeDados implementor = null;
        switch (name) {
            case "DataBase":
                implementor = new DataBase();
                break;
            case "FileSystem":
                implementor = new FileSystem();
                break;
            default:
                throw new Error("Persistencia não encontrada!");
        }
        return implementor;
    }
    
    /**
     * Retorna uma instância de Persistência dado um implementor
     * @param implementor
     * @return 
     */
    public static Persistencia getPersist(PersistenciaDeDados implementor) {
        return new ImplementacaoPersistencia(implementor);
    }
    
}
