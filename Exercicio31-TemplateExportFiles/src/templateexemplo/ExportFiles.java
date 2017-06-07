
package templateexemplo;

import java.io.IOException;


/*Esse codigo esta uma bangunca..*/

public class ExportFiles {
    
    private final ExportWord exWord;
    private final ExportHtml exHtml;

    public ExportFiles() throws IOException {
        String path = new java.io.File(".").getCanonicalPath() + "/src";
        this.exWord = new ExportWord(path + "/word.docx");
        this.exHtml = new ExportHtml(path + "/index.html");
    }
    
    public void exportHTML(String txt){
        this.exHtml.export(txt);
    }
    
    public void exportWord(String txt){  
        this.exWord.export(txt);
    }

}
