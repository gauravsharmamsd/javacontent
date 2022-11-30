package search_algo;
import java.util.Scanner;

public class LinearSearching {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }

        System.out.print("Enter the elemn tof the array: ");
        int ele=sc.nextInt();
        for(int i=0;i<n;i++) {
        	if(arr[i]==ele) {
             
            		System.out.println(" element fount at"+ "positn " +i);
            		break;
            	}
        
        else 
        	if(i==n-1)
      	System.out.println(" not found");
        	
            }
        
        
    }}

