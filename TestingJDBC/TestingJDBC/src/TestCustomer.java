import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestCustomer {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("dbconfig.properties");
		Properties pro = new Properties();
		pro.load(fi);
		String driver = pro.getProperty("driver");
		String url    = pro.getProperty("url");
		String uid    = pro.getProperty("uid");
		String pwd    = pro.getProperty("pwd");
		
		Customer c1=new Customer("Tobby Maguire",new Address("New York",834008,11),11);
		Customer c2=new Customer("Andrew Garfield",new Address("Manhattan",46002,22),22);
		Customer c3=new Customer("Tom Holland",new Address("Chicago",232324,33),33);

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, uid, pwd);
			System.out.println("Connection Established");
			String sql1="create table customer2 (name varchar(40), id int(3) primary key)";
			String sql2="create table address2 (customerid int(3),city varchar(50), pin int(8), foreign key(customerid) references customer2(id))";
			Statement st = conn.createStatement();
					//st.executeUpdate(sql1);
					System.out.println("Customer Table Created");
					//st.executeUpdate(sql2);
					System.out.println("Address Table Created");
			String insertSql1 = "insert into customer2 values(?,?)";
			String insertSql2 = "insert into address2 values(?,?,?)";
			PreparedStatement stmt=conn.prepareStatement(insertSql1);
			PreparedStatement stmt2=conn.prepareStatement(insertSql2);
			
			stmt.setString(1, c1.getName());
			stmt.setInt(2, c1.getId());
			stmt2.setInt(1,c1.getAddr().getId());
			stmt2.setString(2, c1.getAddr().getCity());
			stmt2.setInt(3, c1.getAddr().getPin());
			stmt.execute();
			stmt2.execute();

			stmt.setString(1, c2.getName());
			stmt.setInt(2, c2.getId());
			stmt2.setInt(1,c2.getAddr().getId());
			stmt2.setString(2, c2.getAddr().getCity());
			stmt2.setInt(3, c2.getAddr().getPin());
			stmt.execute();
			stmt2.execute();


			stmt.setString(1, c3.getName());
			stmt.setInt(2, c3.getId());
			stmt2.setInt(1,c3.getAddr().getId());
			stmt2.setString(2, c3.getAddr().getCity());
			stmt2.setInt(3, c3.getAddr().getPin());
			stmt.execute();
			stmt2.execute();
			
			System.out.println("Insert Successful");

			String selectSql = "select customer2.name,customer2.id,address2.city,address2.pin from customer2 inner join address2 on customer2.id=address2.customerid";
			ResultSet resultSet = stmt.executeQuery(selectSql);

			while(resultSet.next()) {
				String name = resultSet.getString("name");
				String city = resultSet.getString("city");
				int pin = resultSet.getInt("pin");
				int id = resultSet.getInt("id");
				System.out.println(name+", "+city+", "+id+", "+pin);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
