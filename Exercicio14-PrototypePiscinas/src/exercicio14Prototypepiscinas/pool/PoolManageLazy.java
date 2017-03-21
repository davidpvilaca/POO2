/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14Prototypepiscinas.pool;

/**
 *
 * @author davidpvilaca
 */
public class PoolManageLazy {
    
    private RoundPool round;
    private HexagonalPool hexagonal;
    private RetangularPool retangular;
    private PoolDirector director;
    
    public PoolManageLazy() {
        this.director = new PoolDirector();
    }
    
    public RoundPool createRoundPool() {
        if (this.round == null) {
            System.out.println(" ---MANAGE LAZY: Criando round pool");
            this.round = this.director.prepareRoundPool();
            return this.round;
        }
        System.out.println(" ---MANAGE LAZY: Clonando round pool");
        return this.round.clone();
    }
    
    public HexagonalPool createHexagonal() {
        if (this.hexagonal == null) {
            System.out.println(" ---MANAGE LAZY: Criando hexagonal");
            this.hexagonal = this.director.prepareHexagonalPool();
            return this.hexagonal;
        }
        System.out.println(" ---MANAGE LAZY: Clonando hexagonal");
        return this.hexagonal.clone();
    }
    
    public RetangularPool createRetangular() {
        if (this.retangular == null) {
            System.out.println(" ---MANAGE LAZY: Criando retangular");
            this.retangular = this.director.prepareRetangularPool();
            return this.retangular;
        }
        System.out.println(" ---MANAGE LAZY: Clonando retangular");
        return this.retangular.clone();
    }
}
