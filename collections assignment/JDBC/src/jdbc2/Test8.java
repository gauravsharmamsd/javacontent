package jdbc2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test8 {
	static Scanner sc =new Scanner(System.in);
static ConnectorClass c=new ConnectorClass();
static PreparedStatement ps=null;
public static void main(String[] args) {
	String q="create table cricket(cricketer varchar(15),Height int(12),Runs int(15))";
	try {
	//	ps=c.createConnection().prepareStatement(q);
		//ps.executeUpdate(q);
		String query1="insert into cricket values(?,?,?)";
	
		String query2="update cricket set Runs=Runs+? where Runs<?";
		String query3 ="select * from cricket";
	
		ps=c.createConnection().prepareStatement(query3);
		
		while(true) {
//			System.out.println("Enter the name of crickter");String name=sc.next();
//			System.out.println("Enetr his height");	int height=sc.nextInt();
//			System.out.println("Enter his run");	int runs=sc.nextInt();
//			ps.setString(1, name);ps.setInt(2, height);ps.setInt(3, runs);
			//ps.setInt(1, 15); ps.setInt(2, 100);
			ResultSet p=ps.executeQuery(query3);
			while(p.next()) {
				System.out.println(p.getInt(3)+"   "+p.getInt(2));
			}
			
			System.out.println("Data iserted into table .....u want to add more???    Y?N");
			String choice =sc.next();
			if(choice.equals("N")) {
				break;
			}
		}
		
		
	} catch (SQLException e) {
			e.printStackTrace();
	}
	
}
}
