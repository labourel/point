import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Arnaud Labourel on 27/09/2018.
 */
public class PointTest {
    @Test
    void constructedPointWithoutArgumentShouldHave00Coordinates(){
        Point p = new Point();
        assertEquals(0, p.x);
        assertEquals(0, p.y);
    }

    @Test
    void pointCreatedFromAnotherPointShouldHaveTheSameCoordinates(){
        final int x = 12;
        final int y = -13;
        Point p = new Point(x, y);
        Point copy = new Point(p);
        assertEquals(x, copy.x);
        assertEquals(y, copy.y);
    }

    @Test
    void aPointShouldBeEqualToItself(){
        Point p = new Point(123, -45);
        assertEquals(p, p);
    }


    @Test
    void distanceFrom11To00ShouldBeSquarerootOf2(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        assertEquals(Math.sqrt(2), p1.distanceTo(p2), 0.00001);
    }
}
