import java.util.ArrayList;

public class TotalArea {

    public static void main(String[] args) {
        Figure circle = new Circle(new Point(2,3,4,5));
        Figure triangle = new Triangle(new Point(2,3,4,5),
                                        new Point(2,3,4,5),
                                        new Point(2,3,4,5));
        Figure rectangle = new Rectangle(new Point(2,3,4,5),new Point(2,3,4,5));

        ArrayList<Figure> list = new ArrayList<>();
        list.add(circle);
        list.add(triangle);
        list.add(rectangle);

        System.out.println(findTotal(list));

    }

    public static double findTotal(ArrayList<Figure> list){
        int sum=0,total;
        for (Figure figure:list) {
            sum += figure.area();
        }
        total = sum / list.size();
        return total;
    }
}
