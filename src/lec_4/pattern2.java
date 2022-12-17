package lec_4;

public class pattern2 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = 4;
		int total_st = 1;
		while (row <= n) {

			int cnt_sp = 1;

			while (cnt_sp <= total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st = 1;
			while (cnt_st <= total_st) {

				if (cnt_st % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				cnt_st++;
			}
			total_st = total_st + 2;
			total_sp--;
			System.out.println();
			row++;
		}
	}
}
