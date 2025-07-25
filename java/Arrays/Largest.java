package Arrays;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner d = new Scanner (System.in);

        System.out.println("Enter the size of an array: ");
        int  n = d.nextInt();
        int [] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int val = 0;

        System.out.println("Enter the elements of an array:");
        for(int i = 0; i<n;i++){
            arr[i]= d.nextInt();
        }
// Finding the largest element in the array
        for(int i = 0; i<n;i++){
            if(arr[i]>large){
                large = arr[i];
                val = i;
            }
        }
// Printing the largest element and its index        
        System.out.println("Largest elemet index is: "+val+" and the value is: "+large);

        // Finding the smallest element in the array
        for(int i=0; i<n;i++){
            if(arr[i]<min){
                min = arr[i];
                val = i;
            }
        }
        System.out.println("Smallest elemet index is: "+val+" and the value is: "+min);
        d.close();
    }
}
