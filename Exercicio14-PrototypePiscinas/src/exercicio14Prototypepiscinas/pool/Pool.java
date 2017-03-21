/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14Prototypepiscinas.pool;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidpvilaca
 */
public abstract class Pool implements Cloneable {
    private String color;
    private boolean isAntiLeak;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsAntiLeak() {
        return isAntiLeak;
    }

    public void setIsAntiLeak(boolean isAntiLeak) {
        this.isAntiLeak = isAntiLeak;
    }
    
    public Pool clone() {
        Pool obj = null;
        try {
            obj = (Pool)super.clone();
            obj.setColor(this.color);
            obj.setIsAntiLeak(this.isAntiLeak);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Pool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
