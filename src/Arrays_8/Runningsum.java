package Arrays_8;

import java.util.Scanner;

public class Runningsum {
  public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		  int[] arr= new int[n];
		    for(int i=0; i<n ; i++) {
			arr[i]=scn.nextInt();
		     }
//		 System.out.println(arr[0]);
		 Running(arr);
		      
}
  public static void Running(int[] arr) {
	   int sum=0;
	  for(int i=0; i<arr.length ; i++) {
		   sum=arr[i]+sum; 
		  System.out.print(sum+" ");
	  }
  }
}
