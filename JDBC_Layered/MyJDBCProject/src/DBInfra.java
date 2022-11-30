import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DBInfra {
	private static Map<String,PreparedStatement> preparedStatementMap = new HashMap();
	private static Connection conn;
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/India","root","A2016ece@4701");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static PreparedStatement saveCustomer;
	static PreparedStatement updateCustomer;
	static PreparedStatement findCustomer;
	static PreparedStatement deleteCustomer;
	static {
		try {
			saveCustomer   =conn.prepareStatement("insert into Customer values(?,?,?,?)");
			updateCustomer =conn.prepareStatement("update Customer set name=? where id = ?");
			findCustomer   =conn.prepareStatement("select * from Customer where custId = ?");
			deleteCustomer =conn.prepareStatement("delete from Customer where custId   = ?");
			preparedStatementMap.put("saveCustomer", saveCustomer);
			preparedStatementMap.put("updateCustomer", updateCustomer);
			preparedStatementMap.put("findCustomer", findCustomer);
			preparedStatementMap.put("deleteCustomer", deleteCustomer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static PreparedStatement getPreparedStatement(String id) {
		return preparedStatementMap.get(id);
	}
	

}
