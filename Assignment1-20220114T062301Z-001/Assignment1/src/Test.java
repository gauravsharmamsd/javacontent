import java.util.Scanner;

public class Test {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		createStudentHardCodedObjects();
		createStudentsWithUserInput();
		createStudentsWithAddress();

	}
	private static void createStudentsWithAddress() {
		System.out.println("No of Students ?");
		int no = sc.nextInt();

		StudentWithAddress[] students = new StudentWithAddress[no];
		for(int i=0; i<no; i++) {
			StudentWithAddress s1 = new StudentWithAddress();
			System.out.println("Enter Age");
			int age= sc.nextInt();
			s1.setAge(age);
			System.out.println("Enter First Name");
			String fname = sc.next();;
			s1.setFname(fname);
			System.out.println("Enter First Name");
			String lname = sc.next();;
			s1.setLname(lname);
			System.out.println("Enter Country");
			String country = sc.next();
			System.out.println("Enter Pin");
			int pin= sc.nextInt();
			System.out.println("Enter City");
			String city= sc.next();
			Address addr = new Address(city,country,pin);
			s1.setAddress(addr);
			students[i] = s1;
		}
		printStudents(students);

	}
	private static void printStudents(StudentWithAddress[] students) {
		for(StudentWithAddress s: students) {
			System.out.println(s);
		}
		
	}
	private static void createStudentsWithUserInput() {
		System.out.println("No of Students ?");
		int no = sc.nextInt();

		Student[] students = new Student[no];
		for(int i=0; i<no; i++) {
			Student s1 = new Student();
			int age= sc.nextInt();
			System.out.println("Enter Age");
			s1.setAge(age);
			System.out.println("Enter City");
			String city= sc.next();
			s1.setCity(city);
			System.out.println("Enter First Name");
			String fname = sc.next();;
			s1.setFname(fname);
			System.out.println("Enter Country");
			String country = sc.next();;
			s1.setCountry(country);
			String lname = sc.next();
			System.out.println("Enter Last Name");
			s1.setLname(lname);
			System.out.println("Enter Pin");
			int pin= sc.nextInt();;
			s1.setPin(pin);
			students[i] = s1;
		}
		printStudents(students);

	}
	private static void createStudentHardCodedObjects() {
		Student[] students = new Student[4];
		Student s1 = new Student();
		s1.setAge(23);
		s1.setCity("Pune");
		s1.setFname("Vivek");
		s1.setCountry("Bharat");
		s1.setLname("Kulkarni");
		s1.setPin(411004);
		students[0] = s1;
		Student s2 = new Student();
		s2.setAge(23);
		s2.setCity("Pune");
		s2.setFname("Vivek");
		s2.setCountry("Bharat");
		s2.setLname("Kulkarni");
		s2.setPin(411004);
		students[1] = s2;
		Student s3 = new Student();
		s3.setAge(23);
		s3.setCity("Pune");
		s3.setFname("Vivek");
		s3.setCountry("Bharat");
		s3.setLname("Kulkarni");
		s3.setPin(411004);
		students[2] = s3;
		Student s4 = new Student("Yogesh","Shinde",25,"Dallas","America",313213);
		students[0] = s4;
		printStudents(students);	
	}

	private static void printStudents(Student[] students) {
		for(Student s: students) {
			System.out.println(s);
		}

	}

}
