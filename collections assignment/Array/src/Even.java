import java.util.Scanner;

public class Even {
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
            for(i=0;i<x;i++){
              if(i%2!=0) {
            	   System.out.print(arr[i]+" ");
              }
    }
          }
}


