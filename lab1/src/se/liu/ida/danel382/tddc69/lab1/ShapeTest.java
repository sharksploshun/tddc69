package se.liu.ida.danel382.tddc69.lab1;

/**
 * by: danel382 at: 2012-08-31 : 16:16
 */

public class ShapeTest {
    // psvm tab
    public static void main(String[] args) {
        // C-A v introduce var
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(1,1,1);
        shapes[1] = new Circle(1,2,3);
        shapes[2] = new Rectangle(1,2,3,4);
        shapes[3] = new Circle(12,45,67);
        shapes[4] = new Rectangle(12,34,56,78);
        // System.out.print("");
        System.out.print('\n'); //newline

        // itar tab or C-j for an iterate live template
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            shape.draw();
            // added getters
            if (shape instanceof Circle) {
                // C-w to select and widen selection. C-A t to surround, choose type
                System.out.println("X coordinate is " + ((Circle) shape).getX());
                System.out.println("Y coordinate is " + ((Circle) shape).getY());
                System.out.println("Radius is " + ((Circle) shape).getR());
                System.out.println("");
            }
            if (shape instanceof Rectangle) {
                System.out.println("X coordinate is " + ((Rectangle) shape).getX());
                System.out.println("Y coordinate is " + ((Rectangle) shape).getY());
                System.out.println("Width is " + ((Rectangle) shape).getWidth());
                System.out.println("Height is " + ((Rectangle) shape).getHeight());
                System.out.println("");
            }
        }
    }
}
