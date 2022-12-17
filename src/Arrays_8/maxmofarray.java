package Arrays_8;

import java.util.Scanner;

public class maxmofarray {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n ; i++) {
			arr[i]=scn.nextInt();
		}
		 int minm=Integer.MIN_VALUE;
		for(int j=0;j<n ; j++) {
			 if(arr[j]>minm) {
				minm=arr[j]; 
			 }
			
		} System.out.println(minm);
		
	}}
