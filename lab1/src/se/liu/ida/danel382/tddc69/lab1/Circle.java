package se.liu.ida.danel382.tddc69.lab1;

/**
 * by: danel382 at: 2012-08-31 : 15:45
 */

public class Circle extends Shape {
    // private int x; private int y;
    // C-click Point to go to that class
    private Point Point;
    private int r;
    public Circle(int x, int y, int r) {
        // this.x = x; this.y = y;
        this.Point = new Point(x, y);
        this.r = r;
        System.out.println("A Circle is constructed");
    }

    @java.lang.Override // helps the IDE (keep method names in synch?)
    public void draw() {
        System.out.println("A Circle is drawn");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (r != circle.r) return false;
        if (Point != null ? !Point.equals(circle.Point) : circle.Point != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Point != null ? Point.hashCode() : 0;
        result = 31 * result + r;
        return result;
    }

    public int getX() {
        return Point.getxCoord();
    }

    public void setX(int x) {
        this.Point.setxCoord(x);
    }

    public int getY() {
        return Point.getyCoord();
    }

    public void setY(int y) {
        this.Point.setyCoord(y);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
