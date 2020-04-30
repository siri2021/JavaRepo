package be.intecbrussel.the_notebook.animal_entites;

import java.util.Set;

import be.intecbrussel.the_notebook.plant_entites.Plant;


public class Herbivore extends Animal {

	private Set<Plant> plantdiet;

	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}
	public Herbivore(String name, double weight, double height, double length, Set<Plant> plantDiet) {
		super(name, weight, height, length);
		this.plantdiet=plantDiet;
	}

	public Set<Plant> getPlantdiet() {
		return plantdiet;
	}

	public void setPlantdiet(Set<Plant> plantdiet) {
		this.plantdiet = plantdiet;
	}

	public void addPlantToDiet(Plant plant) {
		this.plantdiet.add(plant);

	}

	public void printDiet() {

	}

	@Override
	public String toString() {
		return "Name: " + getName() + 
				" Weight: " + getWeight() + 
				"Length : "+ getLength() +  
				"plantdiet=" + plantdiet  ;
	}

}