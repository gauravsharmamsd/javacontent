package Sorting_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class quick {
     
    private int temp_array[];
    private int len;
 
    public void sort(int[] nums) {
         
        if (nums == null || nums.length == 0) {
            return;
        }
        this.temp_array = nums;
        len = nums.length;
        quickSort1(0, len - 1);
    }
    private void quickSort1(int l,int h) {
    	int i=l;
    	int j=h;
    	int  pivot = temp_array[(l+(h-l)/2)];
    	while(i<=j) {
    		while(temp_array[i]< pivot) {
    			i++;
    		}
    		while(temp_array[j] >pivot) {
    			j--;
    		}
    		if(i<=j) {
    			exchangeNumbers(i,j);
    		}
    		if (l < j)
                quickSort1(l, j);
            if (i <h)
                quickSort1(i, h);
      
    			
    	}
    }
          private void exchangeNumbers(int i, int j) {
        int temp = temp_array[i];
        temp_array[i] = temp_array[j];
        temp_array[j] = temp;
    }
     
     // Method to test above
    public static void main(String args[])
    {
        quick ob = new quick();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString (nums));
    }
}
