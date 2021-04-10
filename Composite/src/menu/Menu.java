package menu;

import java.util.ArrayList;
import java.util.Iterator;

import iterator.CompositeIterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents;
    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
        this.menuComponents = new ArrayList<MenuComponent>();
    }

    public void add(MenuComponent menu){
        menuComponents.add(menu);
    }

    public  void remove(MenuComponent menuComponent){
        menuComponent.remove(menuComponent);
    }

    public  MenuComponent getChild(int I){
        return (MenuComponent)menuComponents.get(I);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}

    public Iterator<MenuComponent> createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
