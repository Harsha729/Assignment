package com.project.serch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IsbnSearch implements SearchOperation {

	JDBCConnectionFactory factory = JDBCConnectionFactory.getFactory();
	Connection connection = factory.setConnection();

	public ResultSet doSearch(String searchname, String type) {
		ResultSet rs;
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM books where ISBN = '" + searchname + "'";
		try {
			Statement statement = connection.createStatement();
			System.out.println("In book Concrete isbn Search");
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				String namenow = rs.getString("bookname");
				System.out.println("nam is" + namenow);
				return rs;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
