import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Duplicate {



	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int x =sc.nextInt();
	        int arr[]=new int[x];
	        int i,count=0;
	            for(i=0;i<x;i++){
	                arr[i]=sc.nextInt();
	            }
	            System.out.print("Array: ");
	            for(i=0;i<x;i++){
	            System.out.print(arr[i]+" ");
	     
	            }
	    
//	                }
	          
	          
	            Set<Integer>s =new HashSet<Integer>();
	            for(i=0;i<x;i++){
	         Collections.addAll(s, arr[i]);
	            }
	            
	            System.out.print(s);
	            
	            
}

}

	    
	
				
		
	


