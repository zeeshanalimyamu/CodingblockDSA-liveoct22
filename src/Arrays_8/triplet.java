package Arrays_8;

import java.util.*;

public class triplet {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n ; i++) {
			arr[i]=scn.nextInt();
		}
	
	        int N=scn.nextInt();
	    	for(int last_idx = 1; last_idx<=arr.length-1;last_idx++) {
	    		int   ali = arr[last_idx ];
	    		int   idx=last_idx-1;
	    		while( idx>=0 && arr[idx]>ali ) {
	    			arr[idx+1]=arr[idx];
	    			idx--;
	    		}
	    	        arr[idx+1]=ali;
	    	}
	      
	    
	        
	      for(int i=0;i<n-2;i++) {
		for(int j=i+1 ; j<n-1 ; j++) {
	       int sum=0;
	      for(int k=j+1 ; k<n;k++ ) {
		    sum= arr[i]+arr[j]+arr[k];
		      if(sum==N) {
		    	 System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
		    	 }
	     }
	
	
}}}}

