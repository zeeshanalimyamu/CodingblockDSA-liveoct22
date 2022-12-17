package Arrays_8;

import java.util.*;

public class Squareofarray {
      public static void main(String[] args) {
    	  Scanner scn=new Scanner(System.in);
  	    int N=scn.nextInt();
  	    int[] arr= new int[N];
  	    for(int i=0; i<N ; i++) {
  	    	 arr[i]=scn.nextInt();
  	    }
  	    for(int i=0; i<N ; i++) {
  	    	
  	    	arr[i]=(int) Math.pow(arr[i], 2);
  	    }
  	    
//  	    same as insertion;
  	     for(int e=1 ;  e<arr.length-1; e++) {
  	    	 int temp=arr[e];
  	    	 for(int s=e ; s>=1 ; s--) {
  	    	 if(arr[s-1]>arr[s]) {
  	    		 arr[s]=arr[s-1];
  	    		 arr[s-1]=temp;
  	    	 }}
  	      
  	     }
           for(int ali:arr)
  	     System.out.print(ali+" ");	
  	     
    	    
	}
}
