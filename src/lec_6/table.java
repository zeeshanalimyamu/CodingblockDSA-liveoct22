package lec_6;

import java.util.Scanner;

public class table {
         public static void main(String[] args) {
        	 Scanner scn=new Scanner(System.in);
        	 
			int x= scn.nextInt();
			int y= scn.nextInt();
			while(x<=y) {
				System.out.println(x);
				x=x+13;
			}
			
		}
}
