import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test6 {
	static Statement st=null;
	Connection conn=null;
	public static void main(String[] args) {
	
		ConnectorClass c=new ConnectorClass();
         try {
			st=c.createConnection().createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		//String q="delete from emp  where esal>1000";
        // String q="truncate table emp";
         String q="drop table emp";
		try {
			st.executeUpdate(q);
			System.out.println("deleted");
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
