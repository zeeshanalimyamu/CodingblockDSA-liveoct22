package lec_3;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
    	
		long num=scn.nextLong();
		long ans=0;
		long mult=1;
		while(num>0) {
			long rem=num%10;
			num=num/10;
			if(rem==0) {
				rem=rem+5;
			} 
			
			ans=rem*mult+ans;
			 mult=mult*10;
		}
		if(ans==0) {
			ans=5;
		}
		System.out.println(ans);
	}
}
