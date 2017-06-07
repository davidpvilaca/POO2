/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author davidpvilaca
 */
public class ExportWord extends ExportTemplate {
    
    private final XWPFDocument document;
    private final FileOutputStream out;

    public ExportWord(String path) throws IOException {
        super(path);
        this.out = new FileOutputStream(this.file);
        this.document = new XWPFDocument();
    }

    @Override
    protected void printLine(String line) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(line);
    }

    @Override
    protected void save() {
        try {
            document.write(this.out);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
