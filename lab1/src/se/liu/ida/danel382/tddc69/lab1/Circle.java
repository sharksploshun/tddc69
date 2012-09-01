package se.liu.ida.danel382.tddc69.lab1;

/**
 * User: danel382
 * Date: 2012-08-31
 * Time: 15:45
 */
public class Circle extends Shape {
    // private int x; private int y;
    private Point Point;
    private int r;
    public Circle(int x, int y, int r) {
        // this.x = x; this.y = y;
        this.Point = new Point(x, y);
        this.r = r;
        System.out.println("A Circle is constructed");
    }

    // what is this, I don't even
    @java.lang.Override // helps the IDE (keep method names in synch?)
    public void draw() {
        System.out.println("A Circle is drawn");
    }

    public int getX() {
        return Point.getX();
    }

    public void setX(int x) {
        this.Point.setX(x);
    }

    public int getY() {
        return Point.getY();
    }

    public void setY(int y) {
        this.Point.setY(y);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
