
public abstract class DeliveryDecorator implements Total{

	protected Total bookTotal;
	
	public DeliveryDecorator(Total bookTotal){
		this.bookTotal=bookTotal;
	}
	

	public void calculate(float total){
		bookTotal.calculate(total);
	}
	public double totalAmount(){
		return bookTotal.totalAmount();
	}
	
	
	
}
