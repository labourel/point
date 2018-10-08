import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Arnaud Labourel on 30/09/2018.
 */
public class VectorTest {

    @Test
    public void testVectorInt() {
        Vector vector = new Vector(123);
        assertEquals(vector.capacity(), 123);
        assertEquals(vector.size(), 0);
    }

    @Test
    public void testVector() {
        Vector vector = new Vector();
        assertEquals(vector.capacity(), 10);
        assertEquals(vector.size(), 0);
    }

    @Test
    public void testEnsureCapacityCapacityDoubled() {
        Vector vector = new Vector(23);
        vector.ensureCapacity(24);
        assertThat(vector.capacity(), greaterThanOrEqualTo(23*2));
    }

    @Test
    public void testEnsureCapacityCapacitySatisfied() {
        Vector vector = new Vector(23);
        vector.ensureCapacity(120);
        assertThat(vector.capacity(), greaterThanOrEqualTo(120));
    }

    @Test
    public void testEnsureCapacityCapacityAlwaysIncreased() {
        Vector vector = new Vector(120);
        vector.ensureCapacity(10);
        assertEquals(vector.capacity(), 120);
    }

    @Test
    @Disabled
    public void testResize() {
        Vector vector = new Vector();
        vector.resize(120);
        /* TODO */
        fail("not yet implemented");
    }

    @Test
    public void testResizeZeros() {
        Vector vector = new Vector(1);
        vector.add(2);
        vector.resize(0);
        vector.resize(1);
        assertThat(vector.get(0), equalTo(0));
    }

    @Test
    @Disabled
    public void testResizeCapacityIncreased() {
        /* TODO */
        fail("not yet implemented");
    }

    @Test
    @Disabled
    public void testResizeCapacityAlwaysIncreased() {
        /* TODO */
        fail("not yet implemented");
    }

    @Test
    @Disabled
    public void testIsEmpty() {
        Vector vector = new Vector();
        assertThat(vector.isEmpty(), equalTo(true));
        vector.resize(12);
        /* TODO */
        fail("not yet implemented");
    }

    @Test
    public void testAdd() {
        Vector vector = new Vector();
        vector.add(12);
        vector.add(13);
        vector.add(10);
        assertEquals(vector.size(), 3);
        assertEquals(vector.get(0),12);
        assertEquals(vector.get(1), 13);
        assertEquals(vector.get(2), 10);
        vector.resize(1);
        vector.add(2);
        assertEquals(vector.size(), 2);
        assertEquals(vector.get(1), 2);
    }

    @Test
    @Disabled
    public void testSet() {
        Vector vector = new Vector();
        vector.add(12);
        vector.add(13);
        vector.add(10);
        vector.set(0, 2);
        vector.set(2, 4);
        vector.set(3, 123);
        /* TODO */
        fail("not yet implemented");
    }

    @Test
    @Disabled
    public void testGet() {
        Vector vector = new Vector();
        vector.add(12);
        vector.add(13);
        /* TODO : tester également le fait d'être en dehors des bornes. */
        fail("not yet implemented");
    }

}
