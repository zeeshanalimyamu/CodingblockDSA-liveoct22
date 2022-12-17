package Arrays_8;

import java.util.*;

public class CsumImp {
     public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n ;i++) {
			arr[i]=scn.nextInt();
		}
		int N=scn.nextInt();
		   long sum=0;
		 for(int i=0;i<arr.length;i++) {
			   sum+=arr[i];
		   }
	   for(int j=1;j<=N ;j++) {
		   int x=scn.nextInt();
		  
			sum=2*sum;   
		   
		   
	   }
	   
	    long M=1000000007;
	        sum=sum%M ;
	   System.out.println(sum);
	}
}
