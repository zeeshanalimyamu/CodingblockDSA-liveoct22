package lec_3;

import java.util.Scanner;

public class Reverseofano {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int ans=0;
		while(num>0) {
			 int quot= num/10;
			 int rem=num%10;
			 num=quot;
			 ans=10*ans+rem;
			 
			 
		}
		System.out.println(ans);
	}

}
