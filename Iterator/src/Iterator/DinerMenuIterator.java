package Iterator;

import menu.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public boolean hasNext(){
        if(position>=items.length || items[position] == null)return false;
        return true;
    }

    public MenuItem next(){
        return items[position++];
    }

    public void remove(){
        if(position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if(items[position-1] != null){
            for(int I = position-1; I<(items.length-1); I++){
                items[I] = items[I-1];
            }
        }
        items[items.length-1] = null;
    }
}
