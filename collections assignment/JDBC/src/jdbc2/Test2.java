package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
	static ConnectorClass conn = new ConnectorClass();
	static PreparedStatement ps = null;
	static Connection c = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		String create = "create table BankDetails(name varchar(256),id int(15),balance int(12),city varchar(8))";
		ps = new ConnectorClass().createConnection().prepareStatement(create);
		// ps.executeUpdate(create);
		String q = "insert into BankDetails values(?,?,?,?)";
		ps = conn.createConnection().prepareStatement(q);

		while (true) {
			System.out.println("name");
			String name = sc.next();
			System.out.println("id");
			int id = sc.nextInt();
			System.out.println("bal");
			int bal = sc.nextInt();
			System.out.println("city;");
			String city = sc.next();
			ps.setString(1, name);
			ps.setInt(3, bal);
			ps.setInt(2, id);
			ps.setString(4, city);
			ps.executeUpdate();
			 ps.executeQuery(q);

			System.out.println("insert succesfully? Y/N for more/");
			String choice = sc.next();
			if (choice.equals("N"))
				break;
		}
	}
}
