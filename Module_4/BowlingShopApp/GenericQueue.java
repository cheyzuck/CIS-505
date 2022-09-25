package Module_4.BowlingShopApp;

import java.io.*;
import java.util.*;

public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item){
        list.addFirst(item);
    }
    public void dequeue(E item){
        list.removeFirst();
    }
    public int size(){
        return list.size();
    }
    
}
