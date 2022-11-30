package BankJdbc;
import java.sql.*;
import java.util.Scanner;
public class DatabaseClass {
	static Scanner sc =new Scanner(System.in);
	static PreparedStatement ps=null;
    static ConnectorClass c=new ConnectorClass();
	public static boolean insertDetailsToDataBase(Account ac) throws SQLException {
		boolean Result=false;
		String query1="create table BankService(accNo int(10) primary key auto_increment,AccountHolderName varchar(12),pin int(6),city varchar(12),Balance int(8))";
	//	ps=c.createConnection().prepareStatement(query1);
	//	int x=ps.executeUpdate();
		System.out.println("BankService Table Created Succesfully");
		String query2="insert into Bankservice(AccountHolderName,pin,city,Balance)values(?,?,?,?)";
		
		//String q="insert into students(sname,sphone,scity)values(?,?,?)";
		ps=c.createConnection().prepareStatement(query2);
		
				ps.setString(1, ac.getAcname());
				ps.setInt(2, ac.getPin());
				ps.setString(3, ac.getCity());
				ps.setInt(4, ac.getAmount());
				int x=ps.executeUpdate();
				
				return true;
				
			
		
		
		
	}

}
