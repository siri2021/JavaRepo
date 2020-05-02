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
		CheckBeforeAddAnimal(animal);

	}
	//checking for duplicates and to warn if duplicates are given
	public void CheckBeforeAddAnimal(Animal animal) {
		if(animals.contains(animal))
			System.out.println("WARNING: DUPLICATE ANIMAL "+animal.getName() + " NOT ALLOWED");
		else {
			animals.add(animal);
			if (animal instanceof Carnivore)
				carnivores.add((Carnivore) animal);
			else if ((animal instanceof Herbivore))
				herbivores.add((Herbivore) animal);
			else
				omnivores.add((Omnivore) animal);
			
		}
	}

	public void printCarnivoreList() {
		for (Animal a : carnivores)
			System.out.println(a);
	}

	public void printHerbivoreList() {
		for (Animal a : herbivores)
			System.out.println(a);
	}

	public void printOmnivoreList() {
		for (Animal a : omnivores)
			System.out.println(a);
	}

	public void addPlant(Plant plant) {
		if(plants.contains(plant))
			System.out.println("WARNING: DUPLICATE PLANT " +plant.getName() + "  NOT ALLOWED");
		else
		plants.add(plant);
	}

	public void printNoteBook() {
		System.out.println("****************ANIMALS*****************");
		for (Animal a : animals)
			System.out.println(a);

		System.out.println("***************PLANTS******************");
		for (Plant p : plants) {
			System.out.println(p);
		}

	}

	public void sortAnimalsByName() {
		animals.stream().sorted(Comparator.comparing(Animal::getName)).forEach(System.out::println);

	}

	public void sortPlantsByName() {
		plants.stream().sorted(Comparator.comparing(Plant::getName)).forEach(System.out::println);
	}
	
	public void sortAnimalsByWeight() {
		animals.stream().sorted(Comparator.comparing(Animal::getWeight)).forEach(System.out::println);
	}

	public void sortAnimalsByHeight() {
		animals.stream().sorted(Comparator.comparing(Animal::getHeight)).forEach(System.out::println);
	}


}