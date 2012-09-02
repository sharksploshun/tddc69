package se.liu.ida.danel382.tddc69.lab1;

/**
 * file template
 * by: danel382 at: 12-09-01 11:22 PM
 */
public class Point {
    private int x; private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // should equals() use hashCode() ?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
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
}
