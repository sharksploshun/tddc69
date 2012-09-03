/**
 * by: danel382 at: 2012-09-02 11:23 PM
 */

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();
        int a = 2; int b = 9;
        System.out.println("filling it");
        for (int i = 0; i < b; i++) {
            q.push(i); // no casting
        }

        System.out.println("test for /non-/existing elements");
        if (q.contains(a)) {
            System.out.println("Queue contains " + a);
        } else {
            System.out.println("Queue doesn't contain " + a);
        }
        if (q.contains(b)) {
            System.out.println("Queue contains b" + b);
        } else {
            System.out.println("Queue doesn't contain " + b);
        }

        System.out.println("test for empty");
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue isn't empty");
        }

        System.out.println("clear and test for empty again");
        q.clear();
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue isn't empty");
        }

        System.out.println("fill it again");
        for (int i = 0; i < b; i++) {
            q.push(i);
        }

        System.out.println("empty it one at a time");
        while (!q.isEmpty()) {
            System.out.print(q.pop() + " ");
            System.out.println();
        }
    }
}
