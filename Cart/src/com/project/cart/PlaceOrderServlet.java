package com.project.cart;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlaceOrderServlet extends HttpServlet {

	public void doGet(HttpServletRequest request , HttpServletResponse response){
		
		String paymentOption=request.getParameter("payment_option");
		String deliveryType=request.getParameter("delivery_type");
		System.out.println("the parameters are" +paymentOption +deliveryType);
		if((paymentOption.equals("creditcard") || paymentOption.equals("bitcoin")) && deliveryType.equals("selfpickup")){
			System.out.println("In Normal Price");
			OrderPriceCalculator calctotal = new ActualPrice();
			System.out.print("Total is" +calctotal.calculate(10));
			
		}
		
		else if((paymentOption.equals("creditcard")) && deliveryType.equals("ownerdrop")){
			System.out.println("In Credit Card");
			OrderPriceCalculator calctotal = new TaxTotal(new CreditCardTotal(new ActualPrice()));
			System.out.print("Total is" +calctotal.calculate(10));
		}
		else if((paymentOption.equals("bitcoin")) && deliveryType.equals("ownerdrop")){
			System.out.println("In BitCoin");
			OrderPriceCalculator calctotal = new TaxTotal(new BitCoinTotal(new ActualPrice()));
			System.out.print("Total is" +calctotal.calculate(10));	
		}
	}
	
}
