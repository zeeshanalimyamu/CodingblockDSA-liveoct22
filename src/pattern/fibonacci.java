package pattern;

import java.util.*;

public class fibonacci {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int total_st=1;
	int sum=0;
	int a=0;
	int b=1;
  for(int row=0; row<n; row++) {
	  
	for( int st=0; st<total_st;st++) {
		System.out.print(sum+"\t");
		 a=b;
		 b=sum;
		 sum=a+b;
	}
		
	  
	 total_st++; 
	System.out.println();  
	  
  }
	
	
}
}
