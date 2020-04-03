package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamCar implements IceCreamSeller {

	private PriceList priceList;
	private Stock stock;
	private double profit;

	public IceCreamCar(PriceList priceList) {

		this.priceList = priceList;
	}

	public IceCreamCar(PriceList priceList, Stock stock) {
		this.priceList = priceList;
		this.stock = stock;
	}

	
	@Override
	public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {

		return prepareCone(balls);
	}

	private Cone prepareCone(Flavor[] balls) throws NoMoreIceCreamException {
		Cone cone=new Cone();
		if(stock.getCones()>0) {
			profit+=priceList.getBallPrice();
			stock.setCones(stock.getCones()-1);
			}else { 
				System.out.println("sorry!!!! CONES 0UT OF STOCK");
				
			}
		
		
		
		return cone;
		
	}

	@Override
	public IceRocket orderIceRocket() throws NoMoreIceCreamException {

		return prepareRocket();
	}

	private IceRocket prepareRocket() throws NoMoreIceCreamException {
		
		IceRocket iceRocket=new IceRocket();
		if(stock.getIceRockets()>0) {
			profit+=priceList.getRocketPrice();
			stock.setIceRockets(stock.getIceRockets()-1);
			}else {
				System.out.println("sorry! ICE ROCKETS OUT OF STOCK");
			}
		return iceRocket;
		
	}
	@Override
	public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {

		return prepareMagnum(type);
	}

	private Magnum prepareMagnum(MagnumType type) throws NoMoreIceCreamException {
		Magnum magnum=new Magnum(type);
		if(stock.getMagni()>0) {
			profit+=priceList.getMagnumStandardPrice()*type.getPrice();
			stock.setMagni(stock.getMagni()-1);
			}else { 
				System.out.println("sorry!!!! MAGNUMS OUT OF STOCK");
				
			}
		
		
		return magnum;
		
	}

	@Override
	public double getProfit() {

		return profit;
	}

}
