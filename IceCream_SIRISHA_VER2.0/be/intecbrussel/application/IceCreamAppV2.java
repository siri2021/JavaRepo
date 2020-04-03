package be.intecbrussel.application;

import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {

	public static void main(String[] args) {
		
		//ICEROCKETS,CONES,BALLS,MAGNUMS
		IceCreamCar iceCreamCar = new IceCreamCar(new PriceList(1.50, 2.00, 3.00),  new Stock(2,1,4,1));
		try {
			iceCreamCar.orderIceRocket();
			iceCreamCar.orderIceRocket();
			iceCreamCar.orderIceRocket();
			
			iceCreamCar.orderMagnum(MagnumType.MILKCHOCOLATE);
			iceCreamCar.orderMagnum(MagnumType.MILKCHOCOLATE);
			iceCreamCar.orderCone(new Flavor[]{Flavor.VANILLA , Flavor.PISTACHE});
			iceCreamCar.orderCone(new Flavor[]{Flavor.VANILLA , Flavor.PISTACHE});
			
		}
		catch(Exception e) {
			
		}
		finally{
			System.out.println("YOUR BILL");
			System.out.println("**********");
			
			System.out.println( iceCreamCar.getProfit());
		
		}
	}

}
