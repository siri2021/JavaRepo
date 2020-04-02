package be.intecbrussel.eatables;

public enum Flavor {

	STRAWBERRY(0.89), BANANA(1.00), CHOCOLATE(1.75), VANILLA(1.25), LEMON(0.50), STRACIATELLA(2.25), MOKKA(1.20),
	PISTACHE(1.99);

	private double price;

	private Flavor(double price) {
		this.price = price;

	}

	public double getPrice() {
		return price;
	}

}
