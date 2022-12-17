package pattern;

import java.util.Scanner;

public class Patternglass {
   public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  int tspace=0;
	  int tst=2*n+1;
	  int num=n;
	for(int i=0;i<2*n+1;i++) {
		
		  
		  for(int sp=tspace; sp>0;sp--) {
			  System.out.print("  ");
		  }
		  for(int st=tst; st>0 ;st--) {
			  System.out.print(num+" "); 
			if(i<n) {
			  if(st>n+1-i) {
				 num--;
//				 System.out.println(num);
			    } else {
				 num++;
			    }}
			
			else {
				if(st>i-(n-1)) {
					 num--;
				 } else {
					 num++;
			}
			
		  }}
    System.out.println();
    if(i<n) {	  
		 num=num-2;	
		 
		}else {
			num=num;
		}
	if(i<n) {	  
	 tspace++;	
	}else {
		tspace--;
	}
	if(i<n) {	  
		 tst=tst-2;	
		}else {
			tst=tst+2;
		}
	
}
}}
