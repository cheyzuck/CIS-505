/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 
 
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

*/
package Module_4.BowlingShopApp;

import java.util.*;

public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<E>(); /* This establishes a new LinkedList as a Generic Queue. */

    /* This method adds an item to the queue. */
    public void enqueue(E item){
        list.addFirst(item);
    }
    /* This method removes an item from the queue. */
    public void dequeue(){
        list.removeFirst();
    }
    /* This method returns the size of the queue. */
    public int size(){
        return list.size();
    }
}/* End Generic Queue Class. */
