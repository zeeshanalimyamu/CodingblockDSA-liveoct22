package lec_5;

import java.util.Scanner;

public class UpperCase_lowerCase {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	char ch=scn.next().charAt(0);
	
	if(ch>='A' && ch<='Z') {
		System.out.println("Upper");
	}else if(ch>='a' && ch<='z'  ) {
		System.out.println("Lower");
	}else {
		System.out.println("Invalid");
	}
}
}
