package lec_2;

import java.util.Scanner;

public class PrimeFactors_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 2;
		while (count <= num) {
			while (num > 1) {
				if (num % count == 0) {
					int quot = num / count;
					num = quot;
					System.out.print(count + " ");
				} else {
					count++;
					
				}

			}

		}

	}
}
