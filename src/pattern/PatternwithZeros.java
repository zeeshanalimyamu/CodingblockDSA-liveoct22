package pattern;

import java.util.*;

public class PatternwithZeros {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int ts=1;
	int num=1;
	for(int i=0 ;i<n ;i++) {
		
		
		for(int s=0;s<ts;s++) {
			if(s==0 || s==ts-1) {
			System.out.print(num+"\t");}
			else {
				System.out.print("0"+"\t");
			}
		}
		
	   System.out.println();
	   ts++;
	   num++;
	}
}
}
