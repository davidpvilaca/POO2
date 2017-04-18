/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20Compositemenu.menu;

import java.util.ArrayList;

/**
 *
 * @author davidpvilaca
 */
public class CompositeMenuItem implements IMenu {
    
    private String text;
    private String link;
    private final ArrayList<IMenu> subMenus;
    
    public CompositeMenuItem() {
        this.subMenus = new ArrayList();
    }
    
    public CompositeMenuItem(String text, String link) {
        this.subMenus = new ArrayList();
        this.text = text;
        this.link = link;
    }
    
    public ArrayList<IMenu> getSubMenus() {
        return subMenus;
    }
    
    public void addMenu(IMenu menu) {
        menu.setLink(this.getLink() + menu.getLink());
        this.subMenus.add(menu);
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
