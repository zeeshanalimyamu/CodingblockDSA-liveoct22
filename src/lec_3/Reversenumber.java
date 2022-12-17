package lec_3;

public class Reversenumber {
	public static void main(String[] args) {
		int num = 12435;
		int ans = 0;
		int mult = 1;
		int count = 1;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			rem=rem-1;
			mult = (int)(Math.pow(10,rem));
			ans = count * mult + ans;
             count++;
			
		}
		System.out.println("ans is :    "+ans);

	}

}
