package lec_3;

import java.util.Scanner;

public class OnlineShopping {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		while(n-->0) {
			int n1=scn.nextInt();
			int n2=scn.nextInt();
		    int a=0,b=0;
		    int val=1;
		    while(a<=n1 && b<=n2) {
		    if(a+val%2!=0) {
		    	if(a+val<=n1) 
		    		a+=val;
		        else {
		    			System.out.println("Harshit");
	                    break;
		    		}
		        }
		      else{
		    	if(b+val<=n2)
		    		b+=val;
		    		else{
		    			System.out.println("Ayush");
	                    break;
		    		}
		    }
			
		   val++;
	}
	    }
 scn.close();
}}
