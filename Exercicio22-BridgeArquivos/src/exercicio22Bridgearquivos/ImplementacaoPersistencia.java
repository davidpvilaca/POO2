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
public class ImplementacaoPersistencia extends Persistencia {
    
    public ImplementacaoPersistencia(PersistenciaDeDados persist) {
        super(persist);
    }

    @Override
    public void salvar(Object obj) {
        super.persist.salvar(obj);
    }
    
}
