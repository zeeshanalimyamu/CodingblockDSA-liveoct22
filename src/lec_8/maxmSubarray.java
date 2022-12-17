package lec_8;

public class maxmSubarray {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		print(arr);
		printsum(arr);

	}

	public static void print(int[] arr) {
//    	  here we are using 3 loops which is n ot good
		for (int i = 0; i < arr.length; i++) {
			for (int s = i; s < arr.length; s++) {
				for (int e = i; e <= s; e++) {
					System.out.print(arr[e] + " ");
				}
				System.out.println();
			}

		}
	}public static void printsum(int[] arr) {
  	           int ans=0;
//		here we are using 3 loops which is n ot good
		for (int i = 0; i < arr.length; i++) {
			for (int s = i; s < arr.length; s++) {
				int sum=0;
				
				for (int e = i; e <= s; e++) {
					
					System.out.print(arr[e] + " ");
					sum=sum+arr[e];
				}
				ans=Math.max(ans,sum);
				System.out.println("=>"+ sum);
				System.out.println();
//				System.out.println(ans);
			}

		}System.out.println(ans);
	}
	       
}
