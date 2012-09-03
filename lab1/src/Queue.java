/**
 * by: danel382 at: 2012-09-02 8:40 PM
 */

import java.util.*;

public class Queue {
    // List or ArrayList?
    private List myList;
    // private int index;

    public Queue() {
        // this.index = 0;
        this.myList = new ArrayList();
    }

    // Returns the number of elements
    public int size() {
        return myList.size();
    }

    public void clear() {
        myList.clear();
    }

    public boolean contains(Object o) {
        return myList.contains(o);
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    // size() is magic. no wrapping or casting
    public void push(Object o) {
        // an instance of ArrayList is not an array
        myList.add(o);
    }

    public Object pop() {
        // remove() will throw something if empty
        // if (myList.isEmpty()) { return null; }
        Object o = myList.get(0);
        // no need to null
        myList.remove(0); // at the bottom
        return o;
    }
}
// press F5 to clone the class
