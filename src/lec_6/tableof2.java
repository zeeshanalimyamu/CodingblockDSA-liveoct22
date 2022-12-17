package lec_6;

import java.util.Scanner;

public class tableof2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int num = x;

		while (num <= x * y) {
			System.out.println(num);
			num = num + x;

		}
	}
}
