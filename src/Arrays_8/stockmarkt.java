package Arrays_8;

import java.util.*;

public class stockmarkt {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] price= new int[n];
		for(int i=0; i<n ; i++) {
			 price[i]=scn.nextInt();
	   
		     }
	      System.out.println(maxprofit(price,n));;
		 
	}
   public static int maxprofit(int[]price,int n)	{
	        int profit=0;
	        if(n==1) {
	        	return 0;
	        }
	     for(int i=0; i<n-1 ; i++) {
	    	  for(int j=i+1 ; j<=n-1 ; j++) {
	    		  
	    		  if(price[j]>price[i]) {
	    			  int crnnt_profit= price[j]-price[i];
	    			  profit=Math.max(profit, crnnt_profit);
	    		  
	    	  }
	    	 
	     }
	    	
	
	  
	  
  }  return profit;
		
	   }   
		

}
