package lec_6;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int count=1;
		while(count<=num) {
			System.out.println(count);
			count++;
		}
	}
}
