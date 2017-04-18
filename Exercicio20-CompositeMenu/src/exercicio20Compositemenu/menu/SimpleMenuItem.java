/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20Compositemenu.menu;

/**
 *
 * @author davidpvilaca
 */
public class SimpleMenuItem implements IMenu {
    
    private String text;
    private String link;
    
    public SimpleMenuItem() {
        
    }
    
    public SimpleMenuItem(String text, String link) {
        this.text = text;
        this.link = link;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public void setLink(String link) {
        this.link = link;
    }
    
}
