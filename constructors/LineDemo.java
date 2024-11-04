package constructors;

public class LineDemo {
    public static void main(String[] args) {

        double x = 7, x1 = 2.5, y = 4, y1 = 9;

        Line line = new Line(x, x1, y, y1);
        System.out.println(line.lengh());
        System.out.println("Midpoint - " + line.midPoint().toString());
    }
}