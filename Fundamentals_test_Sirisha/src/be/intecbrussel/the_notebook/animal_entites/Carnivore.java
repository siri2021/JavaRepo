package be.intecbrussel.the_notebook.animal_entites;

public class Carnivore extends Animal {

	private double maxFoodSize;
	

	public Carnivore(String name) {
		super(name);

	}

	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);

	}
	//constuctor giving all properties of super class(Animal) & carnivorous animals
	public Carnivore(String name, double weight, double height, double length, double maxFoodSize) {
		super(name, weight, height, length);
		this.maxFoodSize=maxFoodSize;
	}
	

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {
		return String.format("Name: " +getName() +
				"  Weight: "+ getWeight() +" kg"+
				"  Height :"+ getHeight() +  "meters"+
				"  Length: "+getLength() +" meters"+
				"  MaxFoodSize:" + maxFoodSize +" kg") ;
	}


}
