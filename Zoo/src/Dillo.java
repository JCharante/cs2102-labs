
//This is a class
class Dillo implements IAnimal, IRoadkill {
	
	//Properties or fields
	boolean isDead; //data type = boolean
	int length;		//data type = integer
	
	//Constructor
	public Dillo(int length, boolean isDead) {
		this.isDead = isDead;
		this.length = length;
	}
	
	//Method
	boolean canShelter() { //Method header
		
		//Method body
		if(this.isDead == true && this.length > 60) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean lengthBelow(int size) {
		return this.length < size/2;
	}
	
	public boolean isRoadKill() {
		return isDead;
	}
}
