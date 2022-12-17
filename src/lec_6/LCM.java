package lec_6;

import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	int hcf=1;
	for(int i=1;i<=a;i++) {
		if(a%i==0 && b%i==0) {
			 hcf=i;
		}
	}
	int LCM=(a*b)/hcf ;
	System.out.println(hcf);
}
}
