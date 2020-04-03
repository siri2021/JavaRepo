package be.intecbrussel.eatables;

import java.util.Arrays;



public class Cone implements Eatable {

	private Flavor[] balls;



	public Cone() {

	}

	public Cone(Flavor[] balls) {

		this.balls = balls;
		

	}

	

	public void eat() {

		System.out.println("you are eating " +Arrays.toString( balls));

	}
	

	public Flavor[] getBalls() {
		return balls;
	}

	
	@Override
	public String toString() {
		return "Cone [balls=" + Arrays.toString(balls) + "]";
	}

}
