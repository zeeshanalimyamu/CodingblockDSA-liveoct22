package lec_7;

import java.util.Scanner;

public class increasingdec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int previous = Integer.MAX_VALUE;
		int dec = 1;
		int ans = 0;
		while (n--> 0) {
			int crrnt = scn.nextInt();
			
			  if (dec == 1 && crrnt > previous) {
				dec = 0;}
			else if(dec == 0 && previous > crrnt) {
				ans = 1;}
			 if (crrnt == previous) {
					ans = 1;}
			previous = crrnt;
		}
		if (ans == 0) 
			System.out.println("true");
		 else 
			System.out.println("false");
		

	}
}
