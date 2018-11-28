/*
Authors: Jean Claude Zarate
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}

    @Test
    public void testIsNormalSize() {
        Shark sharkA = new Shark(4, 0);
        assertFalse(sharkA.isNormalSize());
        Shark sharkB = new Shark(6, 0);
        assertTrue(sharkB.isNormalSize());
        Fish fishA = new Fish(15, 3.0);
        assertTrue(fishA.isNormalSize());
    }

    @Test
    public void testIsDangerToPeople() {
        Shark sharkC = new Shark(10, 0);
        assertFalse(sharkC.isDangerToPeople());
        Shark sharkD = new Shark(10, 1);
        assertTrue(sharkD.isDangerToPeople());
        Fish fishB = new Fish(3, 3.75);
        assertFalse(fishB.isDangerToPeople());
    }
    /*
    // This shows what a test case looks like
    @Test
    public void simpleCheck() {
	assertEquals(4, 4);
    }
    */

}
