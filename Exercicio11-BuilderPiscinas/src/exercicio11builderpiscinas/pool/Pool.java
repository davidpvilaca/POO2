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
public abstract class Pool {
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
}
