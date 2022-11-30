import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRepository implements Repository {

	@Override
	public void save(Object obj) {
		if(obj instanceof Customer) {
			Customer c   = (Customer)obj;
			String name  = c.getName();
			Address addr = c.getAddr();
			int id       = c.getId();
			
			PreparedStatement stmt = DBInfra.getPreparedStatement("saveCustomer");//insert into Customer values(?,?,?,?);
			try {
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, addr.getCity());
				stmt.setInt(4, addr.getPin());
				stmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}


		}

	}


	@Override
	public Object findById(int id) {
		PreparedStatement stmt = DBInfra.getPreparedStatement("findCustomer");//select * from Customer where id=?
		try {
			stmt.setInt(1, id);//select * from Customer where id=1
			
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				Customer c = new Customer();
				String name  = result.getString(2);
				int pin      = result.getInt(4);
				String city  = result.getString(3);
				c.setAddr(new Address(city,pin));
				c.setId(id);
				c.setName(name);
				return c;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void delete(int id) {
		PreparedStatement stmt = DBInfra.getPreparedStatement("findCustomer");//select * from Customer where id=?
		try {
			stmt.setInt(1, id);//select * from Customer where id=1
			
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				Customer c = new Customer();
				String name  = result.getString(2);
				int pin      = result.getInt(4);
				String city  = result.getString(3);
				c.setAddr(new Address(city,pin));
				c.setId(id);
				c.setName(name);
				System.out.println("Customer has been deleted succesfully having id  "+id);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	}

}
