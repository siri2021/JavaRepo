package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {

	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;

	public PriceList() {
		this.magnumStandardPrice = 1.5;

	}

	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public double getBallPrice() {
		return ballPrice;
	}

	public double getRocketPrice() {
		return rocketPrice;
	}
	



	public double getMagnumStandardPrice() {
		return magnumStandardPrice;
	}

	@Override
	public String toString() {
		return "PriceList [ballPrice=" + ballPrice + ", rocketPrice=" + rocketPrice + ", magnumStandardPrice="
				+ magnumStandardPrice + "]";
	}
	

}
