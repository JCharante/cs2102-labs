import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	Dillo hugeDeadDillo = new Dillo(65, true);
	
	@Test
	public void testBabyDilloCanShelter() {

		Dillo babyDillo = new Dillo(8, false);
		assertFalse(babyDillo.canShelter());
	}

	@Test
	public void testHugeDeadDilloCanShelter() {
		assertTrue(hugeDeadDillo.canShelter());
	}
	
	@Test
	public void testBoaLikesSameFoodTrue() {
		  Boa myBoa = new Boa("Fred", 3, "mice");
		  Boa otherBoa = new Boa("Barney", 4, "mice");
		
		assertTrue(myBoa.likesSameFood(otherBoa));
	}

	@Test
	public void testBoaLikesSameFoodFalse() {
		  Boa myBoa = new Boa("Fred", 3, "cats");
		  Boa otherBoa = new Boa("Barney", 4, "mice");
		
		assertFalse(myBoa.likesSameFood(otherBoa));
	}
	
}
