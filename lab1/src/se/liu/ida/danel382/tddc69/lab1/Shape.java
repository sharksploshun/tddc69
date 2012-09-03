package se.liu.ida.danel382.tddc69.lab1;

/**
 * by: danel382 at: 2012-08-31 15:39
 */

public abstract class Shape {
   public Shape() {
        // can't paste with S-ins in solaris.
        // C-q javadoc, C-b jump to definition (new tab)
        System.out.println("A Shape is constructed");
   }
   public abstract void draw();
}
