import java.util.Scanner;
public class Main
{                                                               
    public static void main(String[] args)
	{	                                                
        Scanner sc=new Scanner(System.in);             

		System.out.println("Enter a number");
		int n = sc.nextInt();			       
		int count=0;
		if (n==1 || n==0)
		   System.out.println("Not a Prime Number");
		else if (n==2)
		     System.out.println("Prime Number");
		else
		{
		for(int i = 2 ; i <=n ; i++)	
		{	
			if(n % i == 0)				
			count=count+1;
			break;
		}
		if(count == 1)		                        
		System.out.println("Not a Prime Number");
		else
		System.out.println("Prime Number");
		sc.close();	
		}}}