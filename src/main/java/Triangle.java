public class Triangle extends Figure {

    private int a;
    private int b;
    private int c;
    Point p;

    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1.findLength(p1);
        this.b = p2.findLength(p2);
        this.c = p3.findLength(p3);
    }

    @Override
    public int area() {
        return a*b*c;
    }
}
