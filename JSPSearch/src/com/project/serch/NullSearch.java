package com.project.serch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;




public class NullSearch implements SearchOperation {

	JDBCConnectionFactory factory = JDBCConnectionFactory.getFactory();
	Connection connection = factory.setConnection();
	
	@Override
	public ResultSet doSearch(String name, String type) {
		ResultSet rs;
		String sql = "SELECT * FROM nullsearch";
		try {
			Statement statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()){
				return rs;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// TODO Auto-generated method stub
		
	}

}
