package se.liu.ida.danel382.tddc69.lab1;

/**
 * Created with IntelliJ IDEA.
 * User: danel382
 * Date: 2012-08-31
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape {
    int x; int y; int r;
    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
        System.out.println("A Circle is created");
    }

    // what is this, I don't even
    // helps the IDE
    @java.lang.Override
    public void draw() {
        System.out.println("A Circle is drawn");
    }

}
