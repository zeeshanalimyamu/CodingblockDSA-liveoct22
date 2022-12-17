package pattern;

import java.util.*;

public class InvertedHourglass {
    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
    	int n=scn.nextInt();
    	int tstr=0;
    	int tstr1=0;
    	int tsp=2*n-1;
    	int num1=n;
		for(int i=0;i<2*n+1;i++) {
			     int num=n;
			for(int str=0;str<=tstr;str++) {
				System.out.print(num+" ");
				num--;
			}
			for(int sp=tsp;sp>0;sp--) {
				System.out.print("  ");
			}
             
			for(int str=0;str<=tstr1;str++) {
				System.out.print(num1+" ");
				num1++;
			}
		if(i<n-1) {
			num1=num1-2-i;
		}else if(i<n+1) {
			num1=num1-n;
		}else {
			num1=i-num1+2;
		}
		if(i<n)	{
			tstr++;
		} else {
			tstr--;
		    }
		
		if(i<=n-2)	{
			tsp=tsp-2;
		} else if(i>=n+1) {
			tsp=tsp+2;
		}else if(i==n-1){
			tsp--;
		}else {
			tsp++;
		    }
		
		if(i<n-1)	{
			tstr1++;
		} else if(i>=n+1) {
			tstr1--;
		}else {
			tstr1=tstr1;
		}
		
		System.out.println();	
			
		}
	}
}
