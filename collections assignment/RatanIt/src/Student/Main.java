package Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Properties p=new Properties();
		InputStream input =null;
		Statement st=null;
		input=new FileInputStream("Abc.properties");
		p.load(input);
		String driverName=p.getProperty("driver");
		String url=p.getProperty("url");
		String userId=p.getProperty("uid");
		String pwd=p.getProperty("pwd");
		Connection conn =null;
		ResultSet set=null;
		Class.forName(driverName);
		conn=DriverManager.getConnection(url,userId,pwd);
	   System.out.println("Connection established");

		List<Student >al =new ArrayList<Student>();
		Address add1 =new Address("Meerut",123,11);
		Student c1=new Student("Rahu",add1, 1);

		Address add2 =new Address("Delhu",553,12);
		Student c2=new Student("Mahhi",add2, 2);

		Address add3 =new Address("Karachi",123,13);
		Student c3=new Student("Shakib",add3, 3);
		al.add(c3);
		al.add(c2);
		al.add(c1);
		System.out.println(al);
		System.out.println("____________________________");
		String sql1="create table customer (name varchar(40), id int(3) primary key)";
		String sql2="create table address (customerid int(3),city varchar(50), pin int(8), foreign key(customerid) references customer(id))";
		 st = conn.createStatement();
	//	st.executeUpdate(sql1);
		System.out.println("Customer Table Created");
		//st.executeUpdate(sql2);
		System.out.println("Address Table Created");
		String insertSql1 = "insert into customer values(?,?)";
		String insertSql2 = "insert into address values(?,?,?)";
		PreparedStatement stmt=conn.prepareStatement(insertSql1);
		PreparedStatement stmt2=conn.prepareStatement(insertSql2);

		stmt.setString(1, c1.getName());
		stmt.setInt(2, c1.getId());
		
		stmt2.setInt(1,c1.getAddr().getId());
		stmt2.setString(2, c1.getAddr().getCity());
		stmt2.setInt(3, c1.getAddr().getPincode());
		
		stmt.execute();
		stmt2.execute();

		stmt.setString(1, c2.getName());
		stmt.setInt(2, c2.getId());
		
		stmt2.setInt(1,c2.getAddr().getId());
		stmt2.setString(2, c2.getAddr().getCity());
		stmt2.setInt(3, c2.getAddr().getPincode());
		
		stmt.execute();
		stmt2.execute();


		stmt.setString(1, c3.getName());
		stmt.setInt(2, c3.getId());
		
		stmt2.setInt(1,c3.getAddr().getId());
		stmt2.setString(2, c3.getAddr().getCity());
		stmt2.setInt(3, c3.getAddr().getPincode());
		
		stmt.execute();
		stmt2.execute();
		
		System.out.println("Insert Successful");

		String selectSql = "select customer.name,customer.id,address.city,address.pin from customer inner join address on customer.id=address.customerid";
		ResultSet resultSet = stmt.executeQuery(selectSql);

		while(resultSet.next()) {
			String name = resultSet.getString("name");
			String city = resultSet.getString("city");
			int pin = resultSet.getInt("pin");
			int id = resultSet.getInt("id");
			System.out.println(name+", "+city+", "+id+", "+pin);
		}

			
	}}
	        
			