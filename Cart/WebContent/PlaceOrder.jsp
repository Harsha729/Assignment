<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Place Order</title>
</head>
<body>
	<form action="PlaceOrderServlet" method="get">
		<h4>Place Order</h4>

		<p>
			<strong>Choose Payment Type :</strong>
		</p>
				<input type="radio" name="payment_option" value="creditcard">Credit
				Card
				<br>
				<input type="radio" name="payment_option" value="bitcoin">Bit
				Coin
		<p>
			<strong>Choose Delivery Type :</strong>
		</p>
				<input type="radio" name="delivery_type" value="selfpickup">
				Self PickUp
				<br>
				<input type="radio" name="delivery_type" value="ownerdrop">Delivery
				by Owner
				<br>
		<INPUT TYPE="submit" VALUE="Submit">
	</form>
</body>

</html>