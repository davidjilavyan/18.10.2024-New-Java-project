public class Point2 {
    private double x, y;
    public Point2 (double x, double y){
        this.x=x;
        this.y = y;
    }

    public Point2() {
    }

    public Point2(Point clone) {
        this.x = clone.getX();
        this.y = clone.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
