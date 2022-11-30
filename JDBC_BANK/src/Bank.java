import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bank {
	private static String bankname;
	Account acc;
	private static int branchcode;

	//Account Open Method--------------------------------------------------------------
	public int openAccount(String name, int mobno, int amount,int bkid)throws InsufficientAmountException {
		if(amount<1000)
			throw new InsufficientAmountException("Minimum balance 1000 is required");
		int accno = mobno+bkid;
		PreparedStatement stmt = DBInfra.getPreparedStatement("createAccount");
		try {
			stmt.setString(1, name);
			stmt.setInt(2, mobno);
			stmt.setInt(3, accno);
			stmt.setInt(4, amount);
			stmt.executeUpdate();
			return accno;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;


	}//-------------------------------------------------------------------------------

	//Printing Account Details------------------------------------------------------------
	public void showAccountDetails(int accno) throws InvalidAccountException {	
		PreparedStatement stmt = DBInfra.getPreparedStatement("findAccount");
		try {
			stmt.setInt(1, accno);
			ResultSet result = stmt.executeQuery();
//			if(result.next()==false)
//				throw new InvalidAccountException("Account Not Found");
			while(result.next()) {
				String name = result.getString("name");
				int mob = result.getInt("mobile");
				int account = result.getInt("accountno");
				int bal = result.getInt("balance");
				System.out.println("Name: "+name+"\n"+"Mobile: "+mob+"\n"+"Account no: "+account+"\n"+"Balance: "+bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//------------------------------------------------------------------------------------

	//Deposit Method----------------------------------------------------------------------
	public void makeDeposit(int accno, int dep) throws InvalidAccountException {
		PreparedStatement stmt = DBInfra.getPreparedStatement("findAccount");
		PreparedStatement stmt2 = DBInfra.getPreparedStatement("updateAccount");

		try {
			int bal = 0;
			stmt.setInt(1, accno);
			ResultSet result = stmt.executeQuery();
			if(result==null)
				throw new InvalidAccountException("Account Not Found");
			while(result.next()) {
				bal += result.getInt("balance");

			}int balance = dep+bal;
			stmt2.setInt(1, balance);
			stmt2.setInt(2, accno);
			stmt2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//------------------------------------------------------------------------------------

	//Withdraw------------------------------------------------------------------------------
	public void makeWithdraw(int accno, int wt) throws InvalidAccountException,InsufficientAmountException {
		PreparedStatement stmt = DBInfra.getPreparedStatement("findAccount");
		PreparedStatement stmt2 = DBInfra.getPreparedStatement("updateAccount");

		try {
			int bal = 0;
			stmt.setInt(1, accno);
			ResultSet result = stmt.executeQuery();
			if(result==null)
				throw new InvalidAccountException("Account Not Found");
			while(result.next()) {
				bal += result.getInt("balance");

			}int balance = bal-wt;
			if(balance<1000)
				throw new InsufficientAmountException();
			stmt2.setInt(1, balance);
			stmt2.setInt(2, accno);
			stmt2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//Close Account------------------------------------------------------------------------
	public void closeAccount(int accno) throws InvalidAccountException {

		PreparedStatement stmt = DBInfra.getPreparedStatement("deleteAccount");
		try {
			stmt.setInt(1, accno);
			stmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}




	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}


}
