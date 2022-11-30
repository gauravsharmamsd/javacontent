import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Statement stmt=null;
		ConnectorClass c=new ConnectorClass();
		   String tableName = "Abcdefk.txtt";
		  String inpt = tableName.replace(".", "");
				   String sq1 = "Create table  "+inpt +"(age int(5))";
//				   Statement statement = connection.createStatement(createTableSQL);
//				   statememt.execute();
	//	String sql="create table guru (firstname varchar(40), lastname varchar(210), age int(3),id int(5))";
		
		 try {
			stmt = c.createConnection().createStatement();
			int x=stmt.executeUpdate(sq1);
			System.out.println("Table created succesfully  "+x+"  " +inpt);
		 }		catch (SQLException e) {
			 e.printStackTrace();
		}
		 ;}}
