package com.project.serch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BookSearch implements SearchOperation {
	JDBCConnectionFactory factory = JDBCConnectionFactory.getFactory();
	
	Connection connection = factory.setConnection();
	
	
	// ResultConverter rconverter = new ResultConverter();
	ResultSet rs;

	@Override
	public ResultSet doSearch(String name, String type) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM books,bookcategories where bookname= '" + name + "' AND  books.id = bookcategories.id";
		try {
			Statement statement=connection.createStatement();
			System.out.println("In book Concrete Search");
			rs = statement.executeQuery(sql);
			while(rs.next()){
			String namenow = rs.getString("categoryname");
			System.out.println("nam is" +namenow);
			return rs;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
//		try {
//			return rconverter.convert(rs);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
	}
}