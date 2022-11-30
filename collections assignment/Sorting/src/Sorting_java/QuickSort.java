package Sorting_java;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
private int[] temp_arr;
private int length;
	public void sort(int arr[]) {
		if(arr==null || arr.length==0 ) {
			return;
		}
		this.temp_arr=arr;
	length=arr.length;
		quicksort(0,length-1);
	}
	

	
	private void quicksort(int initial, int last) {
		int i=initial;
		int j= last;
		int pivot = temp_arr[initial+(last-initial)/2];
		while (i<=j) {
		while(temp_arr[i]<pivot) {
			i++;
			
		}
		
		while(temp_arr[j]>pivot) {
			j--;
			
		}
		if(i<=j) {
			Swap(i,j);
			i++;
			j--;
		}
		}
		
		if (initial < j)
            quicksort(initial, j);
        if (i <last)
            quicksort(i, last);
  
		
		
		// TODO Auto-generated method stub
		
	}
		
	
	private void Swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=temp_arr[i];
		temp_arr[i]=temp_arr[j];
		temp_arr[j]=temp;
		
	
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuickSort Q = new QuickSort();
		int n=sc.nextInt();
				int arr[] = new int [n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++) {
					System.out.println(arr[i]);
				}
				Q.sort(arr);
				System.out.print(Arrays.toString(arr));
		// TODO Auto-generated method stub

	}

}
