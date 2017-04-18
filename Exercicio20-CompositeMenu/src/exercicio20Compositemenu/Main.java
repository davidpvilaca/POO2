/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio20Compositemenu;

import exercicio20Compositemenu.menu.*;

/**
 *
 * @author davidpvilaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Simple menu
        SimpleMenuItem sMenu1 = new SimpleMenuItem("Menu item 1", "/menu1");
        SimpleMenuItem sMenu2 = new SimpleMenuItem("Menu item 2", "/menu2");
        SimpleMenuItem sMenu3 = new SimpleMenuItem("Menu item 3", "/menu3");
        
        // Composite menu
        CompositeMenuItem cMenu1 = new CompositeMenuItem("Menu composto 1", "/composto1");
        cMenu1.addMenu(sMenu1);
        cMenu1.addMenu(sMenu2);
        
        
        // Printing menus
        Main.printMenu(sMenu3);
        Main.printMenu(cMenu1);
        cMenu1.getSubMenus().forEach(menu -> Main.printMenu(menu));
    }
    
    
    public static void printMenu(IMenu menu) {
        System.out.println(menu.getText() + ":");
        System.out.println(menu.getLink());
    }
    
}
