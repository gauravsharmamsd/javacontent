
public class Employee {
	String getRole() {
	throw new RuntimeException("Role is not yet Assigned");
	}
	public static void main(String[] args) {
		Employee ee=(Employee)ObjectFactory.createObject(args[0]);
System.out.println(ee.getRole());
if(ee instanceof Manager) {
 ((Manager) ee).isLeaveApproved();
}
else if(ee instanceof Developer) {
	((Developer)ee).applyForLeave();

//
//
	}
	}
}
class Manager extends Employee{
	@Override
	String getRole() {
		return "MyRole is Manager";
	}
	boolean isLeaveApproved() {
		System.out.println("manager is about to approve please wait a while");
		return true;
	}
}
	class Developer extends Employee{
		@Override
		String getRole() {
			return "MyRole is Developer";
		}
	public void applyForLeave() {
			System.out.println("Developer applied for leave");
		}
	
	}
	
	
