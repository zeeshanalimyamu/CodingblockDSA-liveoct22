package lec_6;

import java.util.Scanner;

public class Numbersfrmdigit {

        public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int digit;
			long num=0;
			for(int i=n-1;i>=0;i--) {
				
				digit=scn.nextInt();
				long mult=(int)Math.pow(10, i);
                long sum= mult*digit;
				num=num+sum;
				
			}
			System.out.println(num);
          
            
		}
}
