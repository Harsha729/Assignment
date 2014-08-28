<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Box</title>
<script>
function validateForm(){
	var searchVariable = document.forms["myform"]["search"].value;
	if (searchVariable==null || searchVariable==""){
		alert("Enter the search Variable");
		return false;
	}
}

</script>
</head>
<body>
	<form action="SearchServlet" method="get" name="myform" onsubmit="return validateForm()">
		<h4>Place Order</h4>
		<table>
			<TR>
				<TD><Strong>Search</Strong></TD>
				<TD ALIGN="center"><INPUT TYPE="text" SIZE="25" NAME="search">
				</TD>
				<TD><select name="select">
						<option value="null"></option>
						<option value="bookname">Book by Book Name</option>
						<option value="isbn">Book by ISBN Name</option>
						<option value="name">User by Member Name</option>
				</select></TD>
			</TR>



		</table>
		<INPUT TYPE="submit" VALUE="Submit">
	</form>
</body>
</html>