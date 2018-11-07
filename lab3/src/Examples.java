/**
 * Lab 3 by Jean Claude Zarate
 */

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * The class that is detected by junit to run our unit tests
 */
public class Examples {
    Planning planning;

    public Examples(){
        planning = new Planning();
    }

    @Test
    public void testExtractDataOfInterest() {
        assertArrayEquals(
                new LinkedList<>(Arrays.asList(1.0, -2.0, 5.0)).toArray(),
                planning.extractDataOfInterest(
                        new LinkedList<>(Arrays.asList(1.0, -2.0, 5.0, -999.0, 8.0))
                ).toArray()
        );
        assertArrayEquals(
                new LinkedList<>(Arrays.asList(1.0, -2.0)).toArray(),
                planning.extractDataOfInterest(
                        new LinkedList<>(Arrays.asList(1.0, -2.0, -999.0, 5.0, -999.0, 8.0))
                ).toArray()
        );
    }

    @Test
    public void testRainfall() {
        assertEquals(3.0, planning.rainfall(
                new LinkedList<>(Arrays.asList(1.0, -2.0, 5.0, -999.0, 8.0))
        ), 0.01);
        assertEquals(1.0, planning.rainfall(
                new LinkedList<>(Arrays.asList(1.0, -2.0, -999.0, 5.0, -999.0, 8.0))
        ), 0.01);
    }
}
