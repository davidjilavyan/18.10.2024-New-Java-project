
package constructors;

public class TriangleDemo {
    public static void main(String[] args) {
        double x = 9, x1 = 12, x2 = 14, y = 6.1, y1 = 7.2, y2 = 11;

        Triangle triangle = new Triangle(x, y, x1, y1, x2, y2);
        Triangle trianglePoints = new Triangle(new Point(x, y), new Point(x1, y1), new Point(x2, y2));
        Triangle triangleCopy = new Triangle(triangle);

        System.out.println(triangle);
        System.out.println(trianglePoints);
        System.out.println(triangleCopy);
    }
}

