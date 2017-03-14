/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11builderpiscinas.pool;

/**
 *
 * @author davidpvilaca
 */
public class RoundPoolBuilder extends PoolBuilder {

    public RoundPoolBuilder(Pool pool) {
        this.pool = pool;
    }

    @Override
    protected void createBody() {
        System.out.println("Criando corpo redondo");
    }
    
}
