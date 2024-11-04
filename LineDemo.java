public class LineDemo {
    public static void main(String[] args) {
        double x1 = 2.0;
        double x2 = 4.1;
        double y1 = 1.5;
        double y2 = 2.6;

        Line line = new Line(x1, x2, y1, y2);

        System.out.println("line's length is " + line.length());
        System.out.println("line's midlePoint is " + line.midpoint().tostring());
    }
}
