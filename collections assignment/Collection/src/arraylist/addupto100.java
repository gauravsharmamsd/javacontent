package arraylist;

public class addupto100 {
	public static void main(String args[]) {
		int temp,digit,total=0;
		for(int i=1;i<1000;i++) {
			temp=i;
			while(temp>0) {
				digit=temp%10;
				total=total+(digit*digit*digit);
				temp=temp/10;
				
			}
			if(total==i) {
			System.out.println(i+" ");
		}
			total=0;
	}
	}

}
