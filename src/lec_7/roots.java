package lec_7;

import java.util.Scanner;

public class roots {
           public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=scn.nextInt();
			int x=b*b-(4*a*c);
			double y=Math.sqrt(x);
			double z1=(-b+y)/2*a;
			double z2=(-b-y)/2*a;
	        if(y>0 && z1!=z2) {
	        	System.out.println("Real and Distinct");
	        	if(z1>z2)
	        		System.out.print(z2+" "+z1);
	        	   
	        	else {
	        		System.out.print(z1+" "+z2);
	        	}
	        }else if(y>0 && z1==z2) {
	        	System.out.println(z1+" "+z2);
	        }
	        else {
	        	System.out.println("Imaginary");
	        	
	        	
	        }
			
			
		}
}
