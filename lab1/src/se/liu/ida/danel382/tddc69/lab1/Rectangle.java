package se.liu.ida.danel382.tddc69.lab1;

/**
 * User: danel382
 * Date: 2012-08-31
 * Time: 16:06
 */
public class Rectangle extends Shape {
    int x; int y; int width; int height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println("A Rectangle is constructed");
    }

    @java.lang.Override
    public void draw() {
        System.out.println("A Rectangle is drawn");
    }
}
