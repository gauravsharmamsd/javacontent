package arraylist;



import java.util.Scanner;

public class bnvjhb {
public static void main() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int res=0,int tot=0,int sum=0;
while(temp>0) {
	res=temp%10;
	tot=tot+(res*res*res);
	sum=sum+tot;
	temp=temp/10;
}
}
}
