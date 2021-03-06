package waitress;

import java.util.Iterator;

import menu.MenuComponent;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        //É passado um menu com todos os menus dentro
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n-----");
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            
            try{
                if(menuComponent.isVegetarian())menuComponent.print();
            }catch(UnsupportedOperationException e){}
        }
    }
}
