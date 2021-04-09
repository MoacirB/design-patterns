package waitress;

import java.util.ArrayList;
import java.util.Iterator;

import menu.MenuItem;
import menu.Menu;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
            System.out.println();
        }
    }

    void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem)iterator.next();
            System.out.print(item.getName()+", ");
            System.out.print(item.getPrice()+" -- ");
            System.out.println(item.getDescription());
        }
    } 
}
