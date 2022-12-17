package pattern;

import java.util.*;

public class mirrorpattern {
	public static void main(String[] args) {
		
	
	 Scanner scn=new Scanner(System.in);
	   int n=scn.nextInt();
	   int ts=1;
	   int tsp=(n-1)/2;
	   int num=1;
	 for(int i=1; i<=n ; i++ ) {
		 
		 for(int sp=tsp ; sp>0 ; sp--) {
			  System.out.print("\t");
		  }
		 
		  for(int s=0 ; s<ts ; s++) {
			  System.out.print("*"+"\t");
			 
			 
		  }
		
		System.out.println();
		if(i<=(n-1)/2) {
		ts+=2; }
		else {
			ts-=2;
		}
		if(i<=(n-1)/2) {
		tsp--;}
		else {
			tsp++;
		}
		
	 }
    }
}

