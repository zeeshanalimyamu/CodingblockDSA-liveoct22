package Arrays_8;

import java.util.*;

public class majority {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n ; i++) {
			arr[i]=scn.nextInt();
		}

		
		for(int last_idx = 1; last_idx<=n-1;last_idx++) {
		int   ali = arr[last_idx ];
		int   idx=last_idx-1;
		while( idx>=0 && arr[idx]>ali ) {
			arr[idx+1]=arr[idx];
			idx--;
		}
	        arr[idx+1]=ali;}
		int count=0;
		for(int j=0 ; j<arr.length-1 ; j++) {
	       if(arr[j]==arr[j+1]) {
	    	    
	    	   count++;
	             }
	    	 if(count>=(n/2)) {
	    		 System.out.println(arr[j]);
	    		 break;
	    	 }}
	     
		 System.out.println(Arrays.toString(arr));   
	}}
		 
