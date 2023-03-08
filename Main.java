package fabric;

public class Main {

	public static void main(String[] args) {
		CoffeFabric fabric = new CoffeFabric();
		
		Coffe esspresso = fabric.getcoffe(CoffeType.ESSPRESSO);
		Coffe cappuccino = fabric.getcoffe(CoffeType.CAPPUCCINO);
		Coffe latte = fabric.getcoffe(CoffeType.LATTE);
		
		esspresso.drink();
		cappuccino.drink();
		latte.drink();

	}

}
