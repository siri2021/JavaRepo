package be.intecbrussel.application;
import be.intecbrussel.eatables.*;

import java.util.Arrays;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

	public static void main(String[] args) {

		System.out.println("LIST OF MAGNUM TYPES");
		System.out.println("********************");
		for (MagnumType type : MagnumType.values()) {
			// System.out.println();

			System.out.println(type.name() + " = " + type.getPrice());

		}
		System.out.println();
		
		
		System.out.println("LIST OF CONE FLAVOURS");
		System.out.println("***********************");
		for (Flavor type : Flavor.values()) {
			

			System.out.println(type.name() + " = " + type.getPrice());

		}
		System.out.println();

		PriceList priceList = new PriceList(2, 3, 2.24);

		IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

		
		Eatable[] iceCreamOrder = new Eatable[] { new Magnum(MagnumType.MILKCHOCOLATE), new Magnum(MagnumType.ALPINENUTS),
				new Cone(new Flavor[] { Flavor.STRACIATELLA, Flavor.LEMON }), new IceRocket() };
		
		for(Eatable orders:iceCreamOrder) {
			if(orders instanceof Cone) {
				iceCreamSalon.orderCone(((Cone) orders).getBalls());
			}else if(orders instanceof Magnum) {
				iceCreamSalon.orderMagnum(((Magnum) orders).getType());
			}else if(orders instanceof IceRocket) {
				iceCreamSalon.orderIceRocket();
			}	
				
			
		}
		
			
			
		System.out.println("YOU ORERED : "  + Arrays.toString(iceCreamOrder) +"\n\n YOUR BILL AMOUNT IS : " +  iceCreamSalon.getProfit());

	}
}
