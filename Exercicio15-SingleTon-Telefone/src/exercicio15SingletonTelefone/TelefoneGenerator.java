/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15SingletonTelefone;

import java.text.DecimalFormat;

/**
 *
 * @author davidpvilaca
 */
public enum TelefoneGenerator {
    INSTANCE;
    
    private int countCel, countTel = 0;
    private DecimalFormat formatterTel = new DecimalFormat("30000000");
    private DecimalFormat formatterCel = new DecimalFormat("900000000");
    
    public synchronized String nextTel() {
        String str = formatterTel.format(countTel++);
        Estado.telFixos.add(str);
        return str;
    }
    
    public synchronized String nextCel() {
        String str = formatterCel.format(countCel++);
        Estado.celulares.add(str);
        return str;
    }
}
