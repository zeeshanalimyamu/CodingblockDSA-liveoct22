package pattern;

import java.util.*;

public class PatternRhombus {
	  public static void main(String args[]) {
		     Scanner scn=new Scanner(System.in);
			   int n=scn.nextInt();
			   int ts=1;
			   int tsp=n-1;
			   int num=1;
			 for(int i=0; i<n ; i++ ) {
				 
				 for(int sp=tsp ; sp>0 ; sp--) {
					  System.out.print("\t");
				  }
				 
				  for(int s=0 ; s<ts ; s++) {
					  System.out.print(num+"\t");
					 if(s<i && i<n) {
					  num++;}
					 else {
						 if(s<i-(n-1)) {
							 num++;
						 } else {
							 num--;
						 }
					 }
				  }
				 if(i<n-1) { 
				  num+=2;}
				System.out.println();
				if(i<n-1) {
				ts+=2; }
				else {
					ts-=2;
				}
				if(i<n-1) {
				tsp--;}
				else {
					tsp++;
				}
				
}
}}
