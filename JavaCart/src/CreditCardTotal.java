import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CreditCardTotal extends PriceDecorator {
	
	public CreditCardTotal(OrderPriceCalculator bookTotal){
		super(bookTotal);
	}
	
	@Override
	public int calculate(String isbn) {
		// TODO Auto-generated method stub
		JDBCConnectionFactory factory = JDBCConnectionFactory.getFactory();
		Connection connection = factory.setConnection();
		int total;
		String sql = "SELECT * FROM books where ISBN = '" + isbn + "'";
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				total = rs.getInt("price");
				return total + 10;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}


	
}
