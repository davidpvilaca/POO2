/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidpvilaca
 */
public class ExportHtml extends ExportTemplate {
    
    private final BufferedWriter out;

    public ExportHtml(String path) throws IOException {
        super(path);
        this.out = new BufferedWriter(this.fw);
    }

    @Override
    protected void printLine(String line) {
        try {
            out.write("<BR>" + line);
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void save() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
