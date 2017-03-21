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
public class PoolDirector {

    public RoundPool prepareRoundPool() {
        System.out.println("Criando piscina redonda");
        RoundPool pool = new RoundPool();
        RoundPoolBuilder builder = new RoundPoolBuilder(pool);
        builder.createBody();
        builder.paint("azul");
        builder.antiLeak();
        return pool;
    }
    
    public RetangularPool prepareRetangularPool() {
        System.out.println("Criando piscina retangular");
        RetangularPool pool = new RetangularPool();
        RetangularPoolBuilder builder = new RetangularPoolBuilder(pool);
        builder.createBody();
        builder.paint("azul");
        builder.antiLeak();
        builder.createEscada();
        return pool;
    }
    
    public HexagonalPool prepareHexagonalPool() {
        System.out.println("Criando piscina hexagonal");
        HexagonalPool pool = new HexagonalPool();
        HexagonalPoolBuilder builder = new HexagonalPoolBuilder(pool);
        builder.createBody();
        builder.paint("azul");
        builder.antiLeak();
        return pool;
    }
    
}
