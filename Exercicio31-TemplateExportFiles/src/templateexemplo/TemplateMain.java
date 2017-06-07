
package templateexemplo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "linha3\n"
                + "fim\n";                                
      ExportFiles export;
        try {
            export = new ExportFiles();
            export.exportHTML(texto);
            export.exportWord(texto);
        } catch (IOException ex) {
            Logger.getLogger(TemplateMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
