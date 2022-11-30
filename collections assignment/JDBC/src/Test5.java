import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test5 {
	static Statement st=null;
	Connection conn=null;
	public static void main(String[] args) {
	
		ConnectorClass c=new ConnectorClass();
         try {
			st=c.createConnection().createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		String q="update emp set esal=esal+1000 where esal>1000";
		
		try {
			st.executeUpdate(q);
			System.out.println("updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
			if(st!=null) st.close();
			if(c!=null)c.createConnection().close();}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
