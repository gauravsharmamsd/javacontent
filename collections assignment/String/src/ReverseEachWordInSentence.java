import java.util.Scanner;

public class ReverseEachWordInSentence {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();
	char[] ch=s.toCharArray();
	String s1=" ";
	for(int j=0;j<ch.length-1;j++) {
		int p=j;
		while(j<=ch.length-1 && ch[j]!=' ') {
			j++;
		}
	int x=j-1;
	while(x>=p) {
		s1=s1+ch[x];
		x--;
	}
	s1 =s1 +" ";
}
	System.out.println(s1);
}
}