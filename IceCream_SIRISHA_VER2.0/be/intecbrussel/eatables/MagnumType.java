package be.intecbrussel.eatables;

public enum MagnumType {

	MILKCHOCOLATE(1.00), WHITECHOCOLATE(1.20), DARKCHOCOLATE(1.25), ALPINENUTS(1.50), ROMANTICSTRAWBERRIES(2.00);

	private double price;

	private MagnumType(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
