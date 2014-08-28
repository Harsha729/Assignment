public class ByOwnerDeliveryDecorator extends DeliveryDecorator {

	double amount;

	public ByOwnerDeliveryDecorator(Total bookTotal) {
		super(bookTotal);
		// TODO Auto-generated constructor stub
	}

	public void calculate(float total) {
		bookTotal.calculate(total);
	}

	public double totalAmount() {
		amount = 26.0;
		return deliveryAmount();
	}

	public double deliveryAmount() {
		amount = amount + 30;
		return amount;
	}

}
