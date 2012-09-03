package se.liu.ida.danel382.tddc69.lab1;

/**
 * file template
 * by: danel382 at: 12-09-01 11:22 PM
 */
public class Point {
    // S-F6 (refactor>rename) to rename identifier
    private int xCoord; private int yCoord;
    public Point(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    // should equals() use hashCode() ?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (xCoord != point.xCoord) return false;
        if (yCoord != point.yCoord) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xCoord;
        result = 31 * result + yCoord;
        return result;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }
}
