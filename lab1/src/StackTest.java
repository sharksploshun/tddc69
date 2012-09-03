/**
 * by: danel382 at: 2012-09-02 11:23 PM
 */

public class StackTest {
    public static void main(String[] args) {
        Stack q = new Stack();
        int a = 2; int b = 12;
        System.out.println("filling it");
        for (int i = 0; i < b; i++) {
            q.push(i); // no casting
        }

        System.out.println("test for /non-/existing elements");
        if (q.contains(a)) {
            System.out.println("Stack contains " + a);
        } else {
            System.out.println("Stack doesn't contain " + a);
        }
        if (q.contains(b)) {
            System.out.println("Stack contains " + b);
        } else {
            System.out.println("Stack doesn't contain " + b);
        }

        System.out.println("test for empty");
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack isn't empty");
        }

        System.out.println("clear and test for empty again");
        q.clear();
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack isn't empty");
        }

        System.out.println("fill it again");
        for (int i = 0; i < b; i++) {
            q.push(i); // no casting
        }

        System.out.println("empty it one at a time");
        while (!q.isEmpty()) {
            System.out.print(q.pop() + " ");
            System.out.println();
        }
    }
}
