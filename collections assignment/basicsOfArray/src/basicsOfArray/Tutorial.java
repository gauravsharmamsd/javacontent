package basicsOfArray;

public class Tutorial {
public static void main(String args[]) {
	int marks[]= {1,2,6,7};
	printmarks(marks);
	
}

private static void printmarks(int[] marks) {
	for(int i=0;i<marks.length;i++) {
		
	System.out.println(marks[i]);
	}
	for(int p: marks) {
		System.out.println(p);
	}

	// TODO Auto-generated method stub
	
}
}
