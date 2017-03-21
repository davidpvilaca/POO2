/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14Prototypepiscinas;

import exercicio14Prototypepiscinas.pool.HexagonalPool;
import exercicio14Prototypepiscinas.pool.PoolManageLazy;
import exercicio14Prototypepiscinas.pool.RetangularPool;
import exercicio14Prototypepiscinas.pool.RoundPool;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PoolManageLazy pml = new PoolManageLazy();
        System.out.println("======== RETANGULAR ========");
        RetangularPool retangular1 = pml.createRetangular();
        RetangularPool retangular2 = pml.createRetangular();
        System.out.println("======== HEXAGONAL ========");
        HexagonalPool hexagonal1 = pml.createHexagonal();
        HexagonalPool hexagonal2 = pml.createHexagonal();
        System.out.println("======== ROUND ========");
        RoundPool round1 = pml.createRoundPool();
        RoundPool round2 = pml.createRoundPool();
    }
    
}
