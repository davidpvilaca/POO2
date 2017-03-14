/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11builderpiscinas;

import exercicio11builderpiscinas.pool.HexagonalPool;
import exercicio11builderpiscinas.pool.PoolDirector;
import exercicio11builderpiscinas.pool.RetangularPool;
import exercicio11builderpiscinas.pool.RoundPool;

/**
 *
 * @author davidpvilaca
 */
public class Main {
    public static void main(String[] args) {
        PoolDirector director = new PoolDirector();
        System.out.println("======= PISCINA REDONDA =======");
        RoundPool roundPool = director.prepareRoundPool();
        System.out.println("======= PISCINA RETANGULAR =======");
        RetangularPool retangularPool = director.prepareRetangularPool();
        System.out.println("======= PISCINA HEXAGONAL =======");
        HexagonalPool hexagonalPool = director.prepareHexagonalPool();
    }
}
