import java.util.*;
public class SearchAndDelete {
static Scanner sc =new Scanner(System.in);
static int index;
static int size=sc.nextInt();
static int arr[]=new int[size];
	public static void main(String[] args) {
		SearchAndDelete s=new SearchAndDelete();
		
        
    
       
        for(int i=0;i<size;i++) {
        	System.out.println("Enter the element of array At  "+i+  "   posn  ");
        	arr[i]=sc.nextInt();
        }
        for(int array:arr) {
        	System.out.print(array+" ");
        }
        System.out.println();
        System.out.println("enter array element to be search");
        int element=sc.nextInt();
    index = s.search(element);
    System.out.println("element found at this pos   "+index);
    System.out.println("enter array element to be delete");
    int Deleteelement=sc.nextInt();
        s.delete(Deleteelement);
	}
	private void delete(int Deleteelement) {
		int index2=search1(Deleteelement);
		System.out.println("element finf  "+index2);
	for(int i=0;i<arr.length-1;i++) {
		if(Deleteelement==arr[i])
			for(int i1=index2;i1<arr.length-1;i1++) {
		arr[i1]=arr[i1+1];
	}}
	
	for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	
		
	}
	private int search(int element) {
		
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				System.out.println("index we get is"+i);
			return i;
		}
		}
		return -1;
		
	}
private int search1(int Deleteelement) {
		
		for(int i=0;i<arr.length;i++) {
			if(Deleteelement==arr[i]) {
				System.out.println("index we get is"+i);
			return i;
		}
		}
		return -1;
		
	}
 
}
