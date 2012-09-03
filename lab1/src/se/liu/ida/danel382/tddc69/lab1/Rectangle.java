package se.liu.ida.danel382.tddc69.lab1;

/**
 * User: danel382
 * Date: 2012-08-31
 * Time: 16:06
 */
public class Rectangle extends Shape {
    // private int x; private int y;
    private Point Point;
    private int width; private int height;

    public Rectangle(int x, int y, int width, int height) {
        // this.x = x; this.y = y;
        this.Point = new Point(x, y);
        this.width = width;
        this.height = height;
        System.out.println("A Rectangle is constructed");
    }

    @java.lang.Override
    public void draw() {
        System.out.println("A Rectangle is drawn");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (height != rectangle.height) return false;
        if (width != rectangle.width) return false;
        if (Point != null ? !Point.equals(rectangle.Point) : rectangle.Point != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Point != null ? Point.hashCode() : 0;
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }

    public int getX() {
        return Point.getxCoord();
    }

    public void setX(int x) {
        this.Point.setxCoord(x);
    }

    public int getY() {
        return this.Point.getyCoord();
    }

    public void setY(int y) {
        this.Point.setyCoord(y);
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
