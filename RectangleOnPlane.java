public class RectangleOnPlane {
    private double width, height;
    private String id;
    private Point corner;
    public RectangleOnPlane (double width, double height, String id, Point corner) {
        this.width=width;
        this.height=height;
        this.id=id;
        this.corner=new Point(corner);
    }
    public RectangleOnPlane(RectangleOnPlane other){
        this.width= other.width;
        this.height=other.height;
        this.corner=new Point(other.corner);
        this.id=other.id;
    }
}
