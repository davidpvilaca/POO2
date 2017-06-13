
package mementoexamplo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MementoArmazenaConfiguracao {
    
    private ConfiguracaoSO config;
    private ConfiguracaoSO state;
    
    public MementoArmazenaConfiguracao(ConfiguracaoSO config) {
        this.config = config;
        try {
            this.state = (ConfiguracaoSO) this.config.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(MementoArmazenaConfiguracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void restoreState() {
        this.config.setUsb(this.state.isUsb());
        this.config.setVersaoSO(this.state.getVersaoSO());
        this.config.setWifi(this.state.isWifi());
    }
    
}
