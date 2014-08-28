import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ActualPrice implements OrderPriceCalculator {

	JDBCConnectionFactory factory = JDBCConnectionFactory.getFactory();
	Connection connection = factory.setConnection();
	
	@Override
	public int calculate(String isbn) {
		// TODO Auto-generated method stub	
		int total;
		String sql = "SELECT * FROM books where ISBN = '" + isbn + "'";
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				total = rs.getInt("price");
				return total;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;		
	}

}
