package boekoefeningen;



public class ColorApp {

	public static void main(String[] args) {
		Color color1=Color.BLACK;
		Color color2=Color.RED;
		printColor(color1);
		printColor(color2);
		
	}
	public static void printColor(Color color){
		
		System.out.println(color.name());
		System.out.println(color.ordinal());
	}

}
