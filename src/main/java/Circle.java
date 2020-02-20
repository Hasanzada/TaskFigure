public class Circle extends Figure {


    private double pi = 3.14;
    private int radius;

    public Circle(Point p1) {

        this.radius = p1.findLength(p1);
    }

    @Override
    public int area() {
        return (int)pi*(int)Math.pow(radius,2);
    }
}
