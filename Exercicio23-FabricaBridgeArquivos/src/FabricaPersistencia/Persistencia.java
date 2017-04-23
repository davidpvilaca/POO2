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
public abstract class Persistencia {
    
    protected PersistenciaDeDados persist;
    
    public Persistencia(PersistenciaDeDados persist) {
        this.setPersist(persist);
    }
        
    public final void setPersist(PersistenciaDeDados p) {
        this.persist = p;
    }
    
    public abstract void salvar(Object obj);
    
}
