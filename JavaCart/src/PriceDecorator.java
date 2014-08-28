public abstract class PriceDecorator implements OrderPriceCalculator {

	public OrderPriceCalculator bookTotal;

	public PriceDecorator(OrderPriceCalculator bookTotal) {
		this.bookTotal = bookTotal;
	}

	abstract public int calculate(String isbn);

}
