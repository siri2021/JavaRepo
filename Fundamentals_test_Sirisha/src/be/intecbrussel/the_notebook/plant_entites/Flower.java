package be.intecbrussel.the_notebook.plant_entites;

public class Flower extends Plant {

	private Scent smell;
	
	public Flower(String name) {
		super(name);

	}

	public Flower(String name, double height) {
		super(name, height);
	}
	
	public Flower(String name, double height, Scent smell) {
		super(name, height);
		this.smell=smell;
	}
	

	public Scent getSmell() {
		return smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {
		return "Flower Name:" + getName() + "	Smell:" + smell ;
	}

}
