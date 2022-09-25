package Module_4.BowlingShopApp;

import java.util.*;

public class GenericQueue {
    private LinkedList<String> list = new LinkedList<>();

    public void enqueue(item){
        list.addFirst(item);
    }
    public void dequeue(item){
        list.removeFirst();
    }
    public int size(){
        return size(list);
    }
    
}
