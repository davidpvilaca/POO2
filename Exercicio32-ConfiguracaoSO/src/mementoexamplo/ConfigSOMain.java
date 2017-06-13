
package mementoexamplo;


public class ConfigSOMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
  public static void main(String[] args) throws CloneNotSupportedException {

       
       ConfiguracaoSO configuracao = new ConfiguracaoSO();
       configuracao.setUsb(false);
       configuracao.setVersaoSO(1.0);
       configuracao.setWifi(false);
       
       System.out.println(" ======= Configuração inicial ======= ");
       ConfigSOMain.printConfig(configuracao);
       
       MementoArmazenaConfiguracao lembranca = new MementoArmazenaConfiguracao(configuracao);
       
       //utilize o padrão memento para restaurar as configurações do sistema
       //após realizada uma modificação

       configuracao.setVersaoSO(2.0);
       configuracao.setUsb(true);
       
       System.out.println(" ======= Configuração modificada ======= ");
       ConfigSOMain.printConfig(configuracao);
       
       lembranca.restoreState();       
       
       System.out.println(" ======= Configuração restaurada ======= ");
       ConfigSOMain.printConfig(configuracao);
     
   }
  
  
  public static void printConfig(ConfiguracaoSO config) {
      System.out.println("Versão: " + config.getVersaoSO());
      System.out.println("Usb: " + config.isUsb());
      System.out.println("Wifi: " + config.isWifi());
  }
    
}
