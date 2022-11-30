import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DBInfra {
	private static Map<String,PreparedStatement> pstMap = new HashMap(); 
	private static Connection conn;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasif","root","toor");
			System.out.println("db connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static PreparedStatement createAccount;
	static PreparedStatement updateAccount;
	static PreparedStatement findAccount;
	static PreparedStatement deleteAccount;
	static {
		try {
			createAccount   = conn.prepareStatement("insert into bank values(?,?,?,?)");
			updateAccount = conn.prepareStatement("update bank set balance=? where accountno = ?");
			findAccount   = conn.prepareStatement("select * from bank where accountno=?");
			deleteAccount = conn.prepareStatement("delete from bank where accountno= ?");
			pstMap.put("createAccount", createAccount);
			pstMap.put("updateAccount", updateAccount);
			pstMap.put("findAccount", findAccount);
			pstMap.put("deleteAccount", deleteAccount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static PreparedStatement getPreparedStatement(String id) {
		return pstMap.get(id);
	}
}