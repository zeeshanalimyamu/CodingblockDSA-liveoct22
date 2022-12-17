package Arrays_8;

import java.util.*;


public class Roses {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();

		for (int cnt = 0; cnt < N; cnt++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();

			}
			int money = scn.nextInt();
		    int cnt=0;
	     for(int s=0; s<n-1 ;s++) {
	    	    int sum=arr[s];
	    	 for(int e=s+1 ;e<n ; e++ ) {
	    		 sum+=arr[e];
	    		 if(sum==money) {
	    			  cnt++;
	    		    
	    		 }
	    	 }
	     }
		
		
		
		
		}}}		