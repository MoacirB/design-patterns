package iterator;

import java.util.Iterator;
import java.util.Stack;

import menu.Menu;
import menu.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator <MenuComponent> > stack;

    public CompositeIterator(Iterator<MenuComponent> iterator){
        stack = new Stack<Iterator <MenuComponent> >();
        stack.push(iterator);
    }

    public MenuComponent next(){
        if(hasNext()){
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>)stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    public boolean hasNext(){
        if(stack.empty())return false;

        Iterator<MenuComponent> iterator = stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }
        return true;
    }
}
