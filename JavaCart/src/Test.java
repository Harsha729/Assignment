
public class Test {
public static void main(String[] args){
	Total cashtotal = new CashTotal();
	Total newtotal = new ByOwnerDeliveryDecorator(cashtotal);

	System.out.println("Total is : " +newtotal.totalAmount());
}
}
