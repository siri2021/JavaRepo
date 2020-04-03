package be.intecbrussel.eatables;

public class IceRocket implements Eatable {

	public IceRocket() {

	}

	@Override
	public void eat() {
		System.out.println("you are eating  icerocket ");
	}

	@Override
	public String toString() {
		
		return "IceRocket";
	}

	
}
