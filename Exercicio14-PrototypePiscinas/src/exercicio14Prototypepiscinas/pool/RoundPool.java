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
public class RoundPool extends Pool implements Cloneable {
    public RoundPool clone() {
        RoundPool obj = null;
        obj = (RoundPool)super.clone();
        return obj;
    }
}
