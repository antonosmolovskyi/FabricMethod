package fabric;

public class CoffeShop {
	private final CoffeFabric fabric;

	public CoffeShop(CoffeFabric fabric) {
		this.fabric = fabric;
	}

	public Coffe order(CoffeType type) {
		Coffe coffe = fabric.getcoffe(type);
		coffe.drink();
		
		return coffe;
	}
}
