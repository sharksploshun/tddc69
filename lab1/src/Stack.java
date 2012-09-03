/**
 * by: danel382 at: 2012-09-02 11:13 PM
 */

import java.util.ArrayList;
import java.util.List;

public class Stack {
        private List myList;

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
        Object o = myList.get(myList.size() - 1);
        myList.remove(myList.size() - 1); // at the top end
        return o;
    }
}
