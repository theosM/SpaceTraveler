package spacetraveler.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    private Coordinates coordinates1;
    private Coordinates coordinates2;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getDistanceTest() {
        coordinates1 = new Coordinates();
        coordinates2 = new Coordinates(0,5);
        assertEquals(5,(int)coordinates1.getDistance(coordinates2));
        coordinates2 = new Coordinates(4,4);
        assertEquals(6,(int)Math.ceil(coordinates1.getDistance(coordinates2)));
    }
}