package lec_6;

import java.util.Scanner;

public class makenumbrbyconcatenating {
        public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int digit;
			int num=0;
			for(int i=0;i<n;i++) {
				
				digit=scn.nextInt();
				int mult=(int)Math.pow(10, i);
				num=num+mult*digit;
				
			}
			System.out.println(num);
		}
}
