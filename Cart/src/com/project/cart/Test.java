package com.project.cart;

public class Test {

	public static void main (String [] args){
		
		OrderPriceCalculator calctotal = new TaxTotal(new CreditCardTotal(new ActualPrice()));
		System.out.print("Total is" +calctotal.calculate(10));
		
	}
}
