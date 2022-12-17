package Arrays_8;

import java.util.*;

public class LIGHTESTdesert {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n ; i++) {
			 arr[i]=scn.nextInt();}
		  int mithai=Integer.MAX_VALUE;                                  
		for(int j=0; j<n ;j++) {
			 if(arr[j]<mithai) {
				 mithai=arr[j];
			 }}
		for(int k=0; k<n ;k++) {
			 if(arr[k]==mithai) {
				 System.out.println(k+1);
			 }
			
		}
			
		}
	
   
	     
}
