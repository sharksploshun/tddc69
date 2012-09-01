package se.liu.ida.danel382.tddc69.lab1;

/**
 * by: danel382 at: 2012-08-31 15:39
 * Settings:
 * changed font, show line numbers, disabled comment spell check
 * Tools > create command line launcher doesn't do anything
 * made an alias that doesn't work. Can't launch idea.sh in the background&
 * C-y to kill a line, C-v to yank, C-d to double
 * A-S <up> to "bubble" (marked) lines up
 */

public abstract class Shape {
   public Shape() {
        // can only paste with mouse
        // C-q javadoc, C-b jump to definition (new tab)
        System.out.println("A Shape is constructed");
   }
   public abstract void draw();
}
