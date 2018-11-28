
public class Boa implements IAnimal {

	String name;
	int length;
	String eats;
	
	public Boa(String name, int length, String eats) {
		this.name = name;
		this.length = length;
		this.eats = eats;
	}

	boolean likesSameFood(Boa boa1) {
		//boa1.eats
		//this.eats
		
		if(boa1.eats.equals(this.eats)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean lengthBelow(int size) {
		return this.length < size;
	}
	
	public boolean isRoadkill() {
		return false;
	}
	
}
