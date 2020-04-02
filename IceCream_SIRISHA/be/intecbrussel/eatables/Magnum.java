package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	private MagnumType type;
	public Magnum() {

	}

	public Magnum(MagnumType type) {
		this.type = type;
	}
	

	@Override
	public void eat() {

		System.out.println("you are eating " + type);

	
	}

	public MagnumType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Magnum [type=" + type  + "]";
	}
	

}
