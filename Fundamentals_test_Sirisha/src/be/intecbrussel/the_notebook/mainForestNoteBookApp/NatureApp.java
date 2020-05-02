package be.intecbrussel.the_notebook.mainForestNoteBookApp;

import be.intecbrussel.the_notebook.animal_entites.Carnivore;
import be.intecbrussel.the_notebook.animal_entites.Herbivore;
import be.intecbrussel.the_notebook.animal_entites.Omnivore;
import be.intecbrussel.the_notebook.plant_entites.Bush;
import be.intecbrussel.the_notebook.plant_entites.Flower;
import be.intecbrussel.the_notebook.plant_entites.LeafType;
import be.intecbrussel.the_notebook.plant_entites.Plant;
import be.intecbrussel.the_notebook.plant_entites.Scent;
import be.intecbrussel.the_notebook.plant_entites.Tree;
import be.intecbrussel.the_notebook.plant_entites.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {

	public static void main(String[] args) {
		
		//DIGITAL FOREST NOTEBOOK
		ForestNoteBook forestJournal = new ForestNoteBook();
		
		// Create plants for PlantDiet
		Plant bamboo = new Tree("Bamboo", 30, LeafType.NEEDLE );
		Plant rose = new Flower("Rose", 0.45, Scent.SWEET);
		Plant palm = new Tree("Palm", 5, LeafType.HEART );
		Plant crabgrass = new Weed("Crabgrass",  0.2);
		Plant juniper = new Bush("Juniper", 1.50, LeafType.HAND);
		
		// plantnDiet
		Herbivore plantdiet = new Herbivore("herbi");
		plantdiet.addPlantToDiet(bamboo);
		plantdiet.addPlantToDiet(palm);
		plantdiet.addPlantToDiet(crabgrass);
		plantdiet.addPlantToDiet(juniper);
		plantdiet.addPlantToDiet(rose);
		
		//Add Plants to the FOREST NOTEBOOK
		forestJournal.addPlant(bamboo);
		forestJournal.addPlant(rose);
		forestJournal.addPlant(palm);
		forestJournal.addPlant(crabgrass);
		forestJournal.addPlant(juniper);
		forestJournal.addPlant(juniper);
		
		//Add Animals to the forest notebook
		forestJournal.addAnimal(new Carnivore("Tiger", 150, 4, 1, 12));
		forestJournal.addAnimal(new Carnivore("Tiger", 160, 3, 0.75, 9));
		forestJournal.addAnimal(new Herbivore("Elephant", 1000, 2.7, 6.5, plantdiet.getPlantdiet()));
		forestJournal.addAnimal(new Omnivore("Bear", 200, 1.8, 2.5, plantdiet.getPlantdiet(), 300));
		forestJournal.addAnimal(new Herbivore("Zebra", 170, 120, 150, plantdiet.getPlantdiet()));
		forestJournal.addAnimal(new Carnivore("Lion", 190.0, 1.2, 3.2, 15));
		forestJournal.addAnimal(new Herbivore("Giraffe", 400, 320, 250, plantdiet.getPlantdiet()));
		forestJournal.addAnimal(new Omnivore("Hedgehog", 0.90, 0.1, 0.3, plantdiet.getPlantdiet(), 1.0));
		forestJournal.addAnimal(new Herbivore("Deer", 60, 40, 60, plantdiet.getPlantdiet()));
		forestJournal.addAnimal(new Omnivore("Racoon", 6, 0.3, 1, plantdiet.getPlantdiet(), 3.0));
		forestJournal.addAnimal(new Herbivore("Iguana",5.0, 2.2,0.1, plantdiet.getPlantdiet()));
		forestJournal.addAnimal(new Omnivore("Squirrel", 0.3, 1.8, 2.5, plantdiet.getPlantdiet(), 0.25));
		forestJournal.addAnimal(new Herbivore("Elephant", 700, 2.1, 4.5, plantdiet.getPlantdiet()));

		System.out.println("............................................................................");
		System.out.println("NUMBER OF ANIMALS:");
		System.out.println(forestJournal.getAnimalCount());
		
		System.out.println("NUMBER OF PLANTS:");
		System.out.println(forestJournal.getPlantCount());
		System.out.println("\n*************PLANT DIET********************");
		System.out.println("........................................................");
		plantdiet.printDiet();
		forestJournal.printNoteBook();
		System.out.println("\n***Carnivores********");
		forestJournal.printCarnivoreList();
		System.out.println("\n***Herbivores********");
		forestJournal.printHerbivoreList();
		System.out.println("\n***omnivores********");
		forestJournal.printOmnivoreList();
		System.out.println("Sorted Animal List by NAME");
		System.out.println("........................................................");
		forestJournal.sortAnimalsByName();
		System.out.println("Sorted Plant List by NAME");
		System.out.println("..................................................................");
		forestJournal.sortPlantsByName();
		System.out.println("Sorted Animal List by WEIGHT");
		System.out.println("...................................................................................");
		forestJournal.sortAnimalsByWeight();
		System.out.println(".....................................................................................");
		System.out.println("Sorted ANIMAL list by HEIGHT");
		System.out.println(".....................................................................................");
		forestJournal.sortAnimalsByHeight();
		}
}
