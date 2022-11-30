package arraylist;

public class givenUser {
public static void main(String args[]) {
	int[]arr= {5,2,1,6};
	int item=2;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==item) {
			System.out.println(item+" is present at loc "+(i+1));
		count++;
		}
	}
	if(count==0) {
	System.out.println("na");
}
}
}
