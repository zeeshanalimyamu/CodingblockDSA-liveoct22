package Arrays_8;

import java.util.*;

public class Divisiblearrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int n = scn.nextInt();
		for (int cnt = 0; cnt < N; cnt++) {

			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();

			}

			int count = 0;
			for (int s = 0; s < n; s++) {
				for (int e = 0; e <= n; e++) {
					int sum = 0;
					for (s = 0; s <= e; s++) {
						sum = sum + arr[s];
						if (sum % n == 0) {
							count++;
						}
//				System.out.print(arr[s]);

					}

				}
			}
			System.out.println(count);
		}
	}
}
