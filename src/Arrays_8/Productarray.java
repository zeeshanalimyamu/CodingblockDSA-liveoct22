package Arrays_8;

import java.util.*;

public class Productarray {
	public static void main(String[] args) {
		
	
   Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int[] arr = new int[n];
    for(int i=0;i<n ;i++) {
    	arr[i]=scn.nextInt();
       }
     int mult=1;
     for(int i=0;i<n ;i++) {
     	mult*=arr[i];
        }
     for(int i=0;i<n ;i++) {
    	  arr[i]=mult/arr[i];
    	  System.out.print(arr[i]+" ");
     }
    
}}
