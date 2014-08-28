package com.project.serch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NameSearch implements SearchOperation {

	@Override
	public ResultSet doSearch(String name, String type) {

		JDBCConnectionFactory factory = JDBCConnectionFactory.getFactory();

		Connection connection = factory.setConnection();
		// TODO Auto-generated method stub
		String[] tempName;
		String firstName;
		String lastName;
		ResultSet rs;
		tempName = name.split(" ");
		firstName = tempName[0];
		lastName = tempName[1];
		// System.out.println("Name is" +firstName +lastName);
		String sql = "SELECT * FROM members where firstname= '" + firstName
				+ "' AND  lastname = '" + lastName + "'";
		try {
			Statement statement = connection.createStatement();
			System.out.println("In Name Concrete Search");
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				return rs;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
