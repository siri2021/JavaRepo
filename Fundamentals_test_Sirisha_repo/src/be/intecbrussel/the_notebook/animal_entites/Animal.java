package be.intecbrussel.the_notebook.animal_entites;

public class Animal {

	private String name;
	private double weight;
	private double height;
	private double length;

	public Animal(String name) {
		this.name = name;
	}

	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getLength() {
		return length;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Animals [name=" + name + ", weight=" + weight + ", height=" + height + ", length=" + length + "]";
	}

}
