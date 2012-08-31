package se.liu.ida.danel382.tddc69.lab1;

/**
 * Created with IntelliJ IDEA.
 * User: danel382
 * Date: 2012-08-31
 * Time: 15:39
 * To change this template use File | Settings | File Templates.
 * Settings:
 * changed font, show line numbers, disabled comment spell check
 * Tools > create command line launcher doesn't do anything
 * made an alias that doesn't work. Can's start in the background

 */
public abstract class Shape {
   public Shape() {
        // can only paste with mouse
        // C-q javadoc, C-b jump to definition (new tab)
        System.out.println("A shape is constructed");
        public abstract void draw();
    }
}
