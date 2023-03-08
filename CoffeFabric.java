package fabric;

public class CoffeFabric {
	public Coffe getcoffe(CoffeType type) {
		Coffe coffe = null;
		switch (type) {
		case ESSPRESSO:
			coffe = new Esspresso();
			break;
		case LATTE:
			coffe = new Latte();
			break;
		case CAPPUCCINO:
			coffe = new Cappuccino();
			break;
		default:
			throw new IllegalArgumentException("Wrong doughnut type, idiot:" + type);
		}
		return coffe;
	}
}
