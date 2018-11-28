class Main {
  
  public static void main(String[] args) {
	  
	  //Objects = instances of class
	  //Process of creating objects = instantiation
	  Dillo babyDillo = new Dillo(8, false);		//data type = Dillo
	  Dillo adultDillo = new Dillo(24, false);		//data type = Dillo
	  Dillo hugeDeadDillo = new Dillo(65, true);
	  
	  //Another dillo object
	  new Dillo(5, false);
	  Dillo deadDillo = new Dillo(3, true);
	  Dillo anotherDeadDillo = new Dillo(3, true);
	  
	  Boa myBoa = new Boa("Fred", 3, "cats");
	  Boa otherBoa = new Boa("Barney", 4, "mice");
	  myBoa.likesSameFood(otherBoa);

	  
	  Cage myCage = new Cage(5, deadDillo);
	  
	  
	  myBoa.likesSameFood(otherBoa);
	  otherBoa.likesSameFood(myBoa);
	  
    System.out.println(hugeDeadDillo.canShelter());
  }
}