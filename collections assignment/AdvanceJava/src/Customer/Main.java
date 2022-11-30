package Customer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



public class Main {
	List<Customer> al=new ArrayList<Customer>();
Address add1=new Address(245301,"Delhi");
Customer c1=new Customer("Mahhi",5,add1);
Address add2=new Address(245301,"Maeerut");
Customer c2=new Customer("Mahhi",5,add2);
Address add3=new Address(245301,"Haryana");
Customer c3=new Customer("Mahhi",5,add3);



	   dbmap=new Properties();
	     dbmap.load(new FileReader("dbm.properties"));
				try {
					String driverName=getdriverName();
					String url=getURL();
					String userid=getID();
					String pwd=getPwd();
					Class.forName(driverName);
				
					
					Connection conn=null;
					PreparedStatement stmt=null;
					ResultSet rst=null;
				
					conn = DriverManager.getConnection(url,userid, pwd);
					
try {
     String sql="create table Customer(c1,c2,c3)";
    String sql1 = "insert into  customer values(?,?,?)";
    stmt.setString(1,c1.getName());
    stmt.setString(2,c2.getName());
    stmt.setString(1,c3.getName());
    stmt.setAddr(1,c1.getAddr());
    stmt.setAddr(2,c2.getAddr());
    stmt.setAddr(1,c3.getAddr());
    stmt.setInt(1,c1.getId());
    stmt.setInt(2,c2.getId());
    stmt.setInt(3,c3.getId());
    
    
    
    
    ps = con.prepareStatement(sql1);


    // Step 6: Process the results

    ps.execute();

}

catch (Exception e) {


    // Print the exception

    System.out.println(e);





				private static String getID() {
					// TODO Auto-generated method stub
					return dbmap.getProperty("uid");
				}
				private static String getPwd() {
					// TODO Auto-generated method stub
					return dbmap.getProperty("pwd");
				}
				private static String getURL() {
					// TODO Auto-generated method stub
					return dbmap.getProperty("url");
				}
				private static String getdriverName() {
					// TODO Auto-generated method stub
					return dbmap.getProperty("driver");
				}}

}
