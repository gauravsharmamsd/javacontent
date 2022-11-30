import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class TestModular {

	public static void main(String[] args) {
		//Create Seperate class for each of these modules
		//1. Create our domain objects/entities like Customer, Address etc.
		//
		//2. We create connections/loading driver/preparestatement etc. DB Infra code
		
		//3. CRUD operations (Create, Read, Update, Delete)
		

	}

}
class DBUtility{
	//DB Infra Code 
	//1.Load the driver
	//2.Create Connection
	//3. Create all prepareStatements/DDLs
	//Should provide some APIs
	static Map<String,PreparedStatement> prepareStatementMap = new HashMap();
	static {
		Connection conn = DriverManager.getConnection(null,null,null);
		prepareStatementMap.put("addressCreateStatement", conn.prepareStatement("insert into Address values(?,?,?)");
		prepareStatementMap.put("addressUpdateStatement", conn.prepareStatement("update  Address set city=? where custid=?)");
		prepareStatementMap.put("addressDeleteStatement", conn.prepareStatement("delete from Address where custId=?");
		prepareStatementMap.put("addressReadStatement", conn.prepareStatement("select * from Address custId=?");
	}
	public static PreparedStatement getPrepareStatement(String id) {
		return prepareStatementMap.get(id);
	}
	
}
class DBRepository{
	public void save(Object obj) {
		if(obj instanceof Address) {
			Address addr = (Address)obj;
			PrepareStatement stmt = DBUtility.getPrepareStatement("addressCreateStatement");
			stmt.set(1,addre.getCity())
			stmt.executeUpdat();
		}else if (obj instanceof Customer) {
			PrepareStatement stmt = DBUtility.getPrepareStatement("customerCreateStatement");
		}
	}
	public void update(Object obj) {
		if(obj instanceof Address) {
			Address addr = (Address)obj;
			PrepareStatement stmt = DBUtility.getPrepareStatement("addressUpdateStatement");
			stmt.set(1,addre.getCity())
		}else if (obj instanceof Customer) {
			PrepareStatement stmt = DBUtility.getPrepareStatement("customerUpdateStatement");
		}
	}
	public Object get(Object obj) {
		if(obj instanceof Address) {
			Address addr = (Address)obj;
			PrepareStatement stmt = DBUtility.getPrepareStatement("addressReadStatement");
			stmt.set(1,addre.getCity())
		}else if (obj instanceof Customer) {
			PrepareStatement stmt = DBUtility.getPrepareStatement("customerReadStatement");
		}
	}
	public void delete(Object obj) {
		if(obj instanceof Address) {
			Address addr = (Address)obj;
			PrepareStatement stmt = DBUtility.getPrepareStatement("addressDeleteStatement");
			stmt.set(1,addre.getCity())
		}else if (obj instanceof Customer) {
			PrepareStatement stmt = DBUtility.getPrepareStatement("customerDeleteStatement");
		}
	}
	
}
