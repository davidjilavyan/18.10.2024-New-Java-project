public class Line {
    private Point point1, point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(double x1, double x2, double y1, double y2) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
    }

    public Line(Line clone) {
        this.point1 = clone.point1;
        this.point2=clone.point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    public double getX1(){
        return point1.getX();
    }
//    public void setX1(double x1){
//        this.point1.setX(double x1) = x1;
//    }
public double length() {
    return Math.sqrt(Math.pow(point2.getX()- point1.getX(),2) + Math.pow(point2.getY()- point2.getX(), 2));
}
    public Point midpoint() {
        double midX = (point1.getX())+ point2.getX()/ 2;
        double midY = (point1.getY() + point2.getY()) / 2;
        return new Point (midX, midY);
    }
}
