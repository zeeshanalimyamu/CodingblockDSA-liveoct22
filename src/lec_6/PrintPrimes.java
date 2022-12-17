package lec_6;

import java.util.Scanner;

public class PrintPrimes {
     public static void main(String[] args) {
    	 Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		for(int count=2;count<=num;count++) {
			int bckup=count;
			int factor=0;
			for(int i=1;i<=count;i++) {
				
				if(count%i==0) {
					 factor=factor+1;
					 
				   }
				}
			  if(factor<=2) {
				  count=bckup;
			 System.out.println(count);
			}
		}
	}
}
