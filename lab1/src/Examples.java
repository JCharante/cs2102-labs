/*
Lab 1 for Jean Claude Zarate
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    Song HapBD = new Song("Happy Birthday", 18, new Album("Patty Hill, Mildred J. Hill", null));
    Song HandCoversBruise = new Song("Hand Covers Bruise", 300, new Album("Trent Reznor and Atticus Ross", "Dark ambient"));

    public Examples(){}

    @Test
    public void checkHBLen() {
        assertEquals(18, HapBD.lenInSeconds);
    }

    @Test
    public void checkHCBLen() {
        assertEquals(301, HandCoversBruise.lenInSeconds);
    }

    @Test
    public void checkHCBGenre() {
        assertNotNull(HandCoversBruise.onAlbum.genre);
    }
    
    /*
    // This shows what a test case looks like
    @Test 
    public void simpleCheck() {
	assertEquals(4, 4);
    }
    */
  
}
