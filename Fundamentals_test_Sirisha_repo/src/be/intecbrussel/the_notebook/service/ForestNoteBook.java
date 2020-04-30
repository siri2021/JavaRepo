package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import be.intecbrussel.the_notebook.animal_entites.Animal;
import be.intecbrussel.the_notebook.animal_entites.Carnivore;
import be.intecbrussel.the_notebook.animal_entites.Herbivore;
import be.intecbrussel.the_notebook.animal_entites.Omnivore;
import be.intecbrussel.the_notebook.plant_entites.Plant;

public class ForestNoteBook {

	private List<Carnivore> carnivores = new ArrayList<>();
	private List<Omnivore> omnivores = new ArrayList<>();
	private List<Herbivore> herbivores = new ArrayList<>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList<>();
	private List<Plant> plants = new ArrayList<>();

	public ForestNoteBook() {

	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		plantCount = plants.size();
		return plantCount;
	}

	public int getAnimalCount() {
		animalCount = animals.size();
		return animalCount;
	}

	public void addAnimal(Animal animal) {

		animals.add(animal);
		
		if (animal instanceof Carnivore) 
			carnivoreList(animal);
		else if ((animal instanceof Herbivore))
			herbivoreList(animal);
//		else
//			omnivores.add((Omnivore) animal);
//			omnivoreList(animal);
	}

	

	public void carnivoreList(Animal animal) {
		carnivores.add((Carnivore) animal);
	//	int carnivoreCount=carnivores.size();
	}

	public void herbivoreList(Animal animal) {
		herbivores.add((Herbivore) animal);
		//int herbivoreCount=herbivores.size();
	}

//	public void omnivoreList(Animal animal) {
//		omnivores.add((Omnivore) animal);
//		//int omnivoreCount = omnivores.size();
//	}

	public void addPlant(Plant plant) {

		plants.add(plant);
	}

	public void printNoteBook() {
		for (Animal a : animals)
			System.out.println(a);
		System.out.println("************************");
		List<Carnivore> carni=getCarnivores();
		for (Carnivore a : carni)
			System.out.println(a);
		System.out.println("**********************");
		for(Plant p:plants) {
			System.out.println(p);
		}
		
	}
	

	public void sortAnimalsByName() {

	}

	public void sortPlantsByName() {

	}

}