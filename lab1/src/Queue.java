// List is an interface and
// ArrayList is an implementation of the List interface. ?
// What is it? is it abstract? an array?
// Why does the guide say List?
// What is List for when I have ArrayList?

// import both?
// import java.util.List;
import java.util.ArrayList;

/**
 * file template
 * by: danel382 at: 2012-09-02 8:40 PM
 */

public class Queue {
    // List or ArrayList?
    private ArrayList myList;
    // private int index;

    public Queue() {
        // this.index = 0;
        this.myList = new ArrayList(); // ArrayList constructor?
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

    // size() is magic?
    // no wrapping or casting when using this?
    // no allocation here
    public void push(Object o) {
        // it appears, myList is not an array
        myList.add(o);
    }

    public Object pop() {
        // will throw something like IndexOutOfBoundsException ?
        // if (myList.isEmpty()) { return null; }
        Object o = myList.get(myList.size());
        // no need to null
        myList.remove(0); // at the bottom
        return o;
    }
}

// press F5 to clone the class
