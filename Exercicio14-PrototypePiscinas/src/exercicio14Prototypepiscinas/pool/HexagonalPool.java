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
public class HexagonalPool extends Pool {
    public HexagonalPool clone() {
        HexagonalPool obj = null;
        obj = (HexagonalPool)super.clone();
        return obj;
    }
}
