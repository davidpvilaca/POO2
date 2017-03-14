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
public abstract class PoolBuilder {
    protected Pool pool;
    
    protected void paint(String color) {
        System.out.println("Pintando de azul");
        this.pool.setColor(color);
    }
    protected void antiLeak() {
        System.out.println("Tratamento anti vazamento");
        this.pool.setIsAntiLeak(true);
    }
    protected void createEscada() {
        System.out.println("Criando escada");
        if (this.pool instanceof RetangularPool) {
            ((RetangularPool)this.pool).setEscada(new Escada());
        }
    }
    
    protected abstract void createBody();
}
