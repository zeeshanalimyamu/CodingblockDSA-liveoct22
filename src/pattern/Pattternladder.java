package pattern;

import java.util.Scanner;

public class Pattternladder {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int row=scn.nextInt();
	int sum=1;
	for(int i=1 ;i<=row ;i++) {
		for(int j=1 ;j<=i;j++) {
		System.out.print(sum);
		sum++;
		
	} System.out.println();
		}
}
}
