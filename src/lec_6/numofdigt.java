package lec_6;

import java.util.Scanner;

public class numofdigt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int dgt = scn.nextInt();
		int count = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem == dgt) {
                       count++;
				
		    }
			num=num/10;}
		System.out.println(count);
			
	}
}
