import java.util.Objects;

/**
 * Created by Arnaud Labourel on 27/09/2018.
 */
public class Point{
    /**
     * The {@code X} coordinate of this Point.
     */
    public int x;
    /**
     * The {@code Y} coordinate of this Point.
     */
    public int y;

    /**
     * Constructs and initializes a point at the origin (0, 0) of the coordinate space.
     */
    public Point() {
        this(0, 0);
    }

    /**
     * Constructs and initializes a point at the specified (x,y) location in
     * the coordinate space.
     *
     * @param x the X coordinate of the newly constructed {@code Point}
     * @param y the Y coordinate of the newly constructed {@code Point}
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs and initializes a point with the same location as the specified
     * {@code Point} object.
     *
     * @param p a point
     */
    public Point(Point p) {
        this(p.x, p.y);
    }

    /**
     * Returns the hashcode for this {@code Point}.
     *
     * @return a hash code for this {@code Point}.
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * Determines whether or not two points are equal. Two instances of {@code Point}
     * are equal if the values of their {@code x} and {@code y} member fields,
     * representing their position in the coordinate space, are the same.
     *
     * @param obj an object to be compared with this {@code Point}.
     * @return {@code true} if the object to be compared is an instance of {@code Point}
     * and has the same values; {@code false} otherwise.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == this.x && p.y == this.y;
    }

    public double distanceTo(Point p){
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.hypot(dx,dy);
    }

}
