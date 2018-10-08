/**
 * Created by Arnaud Labourel on 08/10/2018.
 */
public class Segment {
    Point endPoint1;
    Point endPoint2;

    public Segment(Point endPoint1, Point endPoint2) {
        this.endPoint1 = endPoint1;
        this.endPoint2 = endPoint2;
    }

    double length(){
        endPoint1.distanceTo(endPoint2)
    }
}
