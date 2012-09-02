/**
 * file template
 * by: danel382 at: 2012-09-02 11:13 PM
 */

import java.util.ArrayList;

public class Stack {
        private ArrayList myList;

    public Stack() {
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

    public void push(Object o) {
        myList.add(o);
    }

    public Object pop() {
        Object o = myList.get(myList.size());
        myList.remove(myList.size()); // at the top end
        return o;
    }
}
