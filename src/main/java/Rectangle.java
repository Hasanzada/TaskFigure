public class Rectangle extends Figure {

    private int a;
    private int b;
    Point p;

    public Rectangle(Point p1, Point p2) {

        this.a = p1.findLength(p1);
        this.b = p2.findLength(p2);
    }

    @Override
    public int area() {
        return a*b/2;
    }
}
