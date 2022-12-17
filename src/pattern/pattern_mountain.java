package pattern;

import java.util.Scanner;

public class pattern_mountain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int total_st = 1;
		int total_sp = 2*N-3;
		int total_st1 = 1;
		int num1 = 1;
		for (int row = 0; row < N; row++) {
			int num = 1;
			for (int cnt_st = 0; cnt_st < total_st; cnt_st++) {
				System.out.print(num+"\t" );
				num = num + 1;
			}
			for (int cnt_sp = total_sp; cnt_sp >= 1; cnt_sp--) {
				System.out.print("\t");
			}
			for (int cnt_st = 0; cnt_st < total_st1; cnt_st++) {

				System.out.print(num1+"\t");
				num1 = num1 - 1;

			}
            if(row<N-2) {
			num1 = num1 + (row + 2);}
            else {
            	num1 = num1 + (row + 1);
            }
			total_sp = total_sp - 2;
			System.out.println();
			total_st++;
			if (row < N - 2) {
				total_st1++;
			}
		}
	}
}
