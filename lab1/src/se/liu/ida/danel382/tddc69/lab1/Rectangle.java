package se.liu.ida.danel382.tddc69.lab1;

/**
 * User: danel382
 * Date: 2012-08-31
 * Time: 16:06
 */
public class Rectangle extends Shape {
    private int x; private int y; private int width; private int height;
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
