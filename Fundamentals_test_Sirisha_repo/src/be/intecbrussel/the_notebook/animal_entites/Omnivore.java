package be.intecbrussel.the_notebook.animal_entites;

import java.util.HashSet;
import java.util.Set;


import be.intecbrussel.the_notebook.plant_entites.Plant;

public class Omnivore extends Animal {

	private Set<Plant> plantdiet=new HashSet<Plant>();
	private double maxFoodSize;

	public Omnivore(String name) {
		super(name);

	}

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);

	}
	
	public Omnivore(String name, double weight, double height, double length,Set<Plant> plantdiet,double maxFoodSize) {
		super(name, weight, height, length);
		this.plantdiet= plantdiet;
		this.maxFoodSize=maxFoodSize;

	}

	public Set<Plant> getPlantdiet() {
		return plantdiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setPlantdiet(Set<Plant> plantdiet) {
		this.plantdiet = plantdiet;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	public void addPlantToDiet(Plant plant) {
		this.plantdiet.add(plant);
	}

	@Override
	public String toString() {
		
		return "Name: " + getName() + 
				" Weight: " + getWeight() + 
				"Length : "+ getLength() +  
				"plantdiet=" + plantdiet + 
				" maxFoodSize=" + maxFoodSize ;
	}
	
}