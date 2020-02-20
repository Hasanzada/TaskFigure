public class Point {

    int x1,y1,x2,y2;

    public Point(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int findLength(Point p){
        int a;
        int x = p.x1-p.x2;
        int y = p.y1 - p.y2;
        a = (int)(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        return a;
}
}
