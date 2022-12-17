package Arrays_8;

import java.util.Scanner;

public class sum_of_pairs {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	  int[] arr= new int[n];
	for(int i=0; i<n ; i++) {
		arr[i]=scn.nextInt();
	}
	  int N=scn.nextInt();
	for(int i=0;i<n-1;i++) {
	    int sum=0;
	   for(int j=i+1 ; j<n ; j++) {
		 sum= arr[i]+arr[j];
		      if(sum==N) {
		    	 if(arr[i]<arr[j]) {
			  System.out.println(arr[i]+" "+arr[j]);
		            }
		    	 else {
		    	System.out.println(arr[j]+" "+arr[i]);
		    	 }
	     }
	
	
}}}}
