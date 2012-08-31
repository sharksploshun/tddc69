package se.liu.ida.danel382.tddc69.lab1;

/**
 * Created with IntelliJ IDEA.
 * User: danel382
 * Date: 2012-08-31
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle extends Shape {
    int x; int y; int width; int height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println("A Rectangle is created");
    }

    @java.lang.Override
    public void draw() {
        System.out.println("A Rectangle is drawn");
    }
}
