/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author davidpvilaca
 */
public abstract class ExportTemplate {
    
    protected File file;
    protected FileWriter fw;
            
    public ExportTemplate(String path) throws IOException {
        this.file = new File(path);
        this.fw = new FileWriter(file.getAbsoluteFile());
    }
    
    public void export(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(String linha : txtLinhas )
            this.printLine(linha);
        this.save();
    }
    
    protected abstract void printLine(String line);
    protected abstract void save();
    
}
