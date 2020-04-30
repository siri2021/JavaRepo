package be.intecbrussel.the_notebook.mainForestNoteBookApp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import be.intecbrussel.the_notebook.animal_entites.Animal;
import be.intecbrussel.the_notebook.animal_entites.Carnivore;
import be.intecbrussel.the_notebook.animal_entites.Herbivore;
import be.intecbrussel.the_notebook.animal_entites.Omnivore;
import be.intecbrussel.the_notebook.plant_entites.Bush;
import be.intecbrussel.the_notebook.plant_entites.Flower;
import be.intecbrussel.the_notebook.plant_entites.Plant;
import be.intecbrussel.the_notebook.plant_entites.Tree;
import be.intecbrussel.the_notebook.plant_entites.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {

	public static void main(String[] args) {
		
		ForestNoteBook forestJournal= new ForestNoteBook();
		
		Animal Tiger=new Carnivore("Tiger");
		Animal Elephant=new Herbivore("Elephant");
		Animal Bear= new Omnivore("Bear");
		Animal Zebra=new Herbivore("Zebra");
		Animal Lion=new Carnivore("Lion");
		Animal Giraffe=new Herbivore("Giraffe");
		Animal Rat= new Omnivore("Rat");
		Animal Cow=new Herbivore("Cow");
		Animal Pig= new Omnivore("Pig");
		
		Plant Mango=new Tree("Mango");
		Plant Rose=new Flower("Rose");
		Plant Coca=new Bush("Coca");
		Plant Crabgrass=new Weed("Crabgrass");
		Plant Hibiscus=new Flower("Hibiscuss");
		forestJournal.addPlant(new Tree("Mango"));
		forestJournal.addPlant(new Flower("Rose"));
		forestJournal.addPlant(Coca);
		forestJournal.addPlant( Crabgrass);
		forestJournal.addPlant(Hibiscus);
		Set<Plant> plantDiet=new HashSet<>();
		plantDiet.add(Rose);
		plantDiet.add(Coca);
		plantDiet.add(Crabgrass);
		

		forestJournal.addAnimal(new Carnivore("Tiger", 150, 4, 1, 100));
		forestJournal.addAnimal(new Herbivore("Elephant",1000, 2.7, 6.5));
		forestJournal.addAnimal(new Omnivore("Bear", 200, 1.8, 2.5, plantDiet, 300));
		forestJournal.addAnimal(new Herbivore("Zebra", 170, 120, 150));
		forestJournal.addAnimal(Lion);
		forestJournal.addAnimal(Giraffe);
		forestJournal.addAnimal( Rat);
		forestJournal.addAnimal(Cow);
		forestJournal.addAnimal(Pig);
		forestJournal.addAnimal(Zebra);
		forestJournal.addAnimal(Bear);
		
		
		
		//System.out.println(forestJournal.getCarnivores());
		System.out.println(forestJournal.getAnimalCount());
		System.out.println(forestJournal.getPlantCount());
		forestJournal.printNoteBook();
		
		
	

}
}
