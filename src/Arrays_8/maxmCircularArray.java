package Arrays_8;

import java.util.*;

public class maxmCircularArray {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	for(int i=0 ; i<n ;i++) {
		int N=scn.nextInt();
		int[] arr=new int[N];
		for(int j=0; j<N ;j++) {
			arr[j]=scn.nextInt();
		}
	   int mxm=Integer.MIN_VALUE;
	   int mnm=Integer.MAX_VALUE;
	   
	   int cmxm=0;
	   int cmnm=0;
	   int sum=0;
	   for(int k=0;k<arr.length;k++) {
		   
		  cmxm=cmxm+arr[k];

		  mxm=Math.max(mxm,cmxm);
		  if(cmxm<=0) {
			  cmxm=0;
		      }
 
		  
		  sum+=arr[k];
		  
		  cmnm+=arr[k];
		  mnm=Math.min(cmnm, mnm);
		  
		  if(cmnm>0) {
			  cmnm=0;
		       }
		 
		  
	   }
	   
		int ans= Math.max(mxm, sum-mnm);
		System.out.println(ans);
	}
	  
}
}
