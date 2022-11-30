package arraylist;

public class armstron2 {
public static void main(String args[]) {
	int temp=0,last_digit=0,total=0;
	for(int i=1;i<1000;i++) {
		temp=i;
		while(temp>0) {
			last_digit=temp%10;
			total=total+(last_digit*last_digit*last_digit);
			temp=temp/10;
		}
		if(total==i) {
		System.out.println(total);
		}
		total=0;
	}
}
}
