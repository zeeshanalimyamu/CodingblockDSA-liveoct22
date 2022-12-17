package lec_3;

import java.util.Scanner;

public class Class {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	long num=scn.nextLong();
	long count=1;
	long ans=0;
			while(num>0) {
				int rem=(int)num%10;
				if(rem>4) {
					rem=9-rem ;
				}
				num=num/10;
				if(rem==0 && num==0) {
					rem=rem + 9;
				}
			  
				ans=rem*count + ans;
				count=10*count;
		
			}
			System.out.println(ans);	
}
}
