public class Point {
    private double x, y;
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
        public Point (Point other){
            this.x = other.x;
            this.y = other.y;
    }

    public Point() {
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

    public void tostring() {
        System.out.println(getX()+"," + getY());
            }
}
