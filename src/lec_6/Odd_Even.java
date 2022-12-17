package lec_6;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int num;
		
		for(int i=1; i<=n;i++) {
			num=scn.nextInt();
			int sumeven=0;
			int sumodd=0;
			while(num>0) {
			   int dig=num%10;
			    if(dig%2==0) {
			   sumeven=sumeven+dig;
			    } 
//			    else if(dig%2!=0){
			    else{sumodd=sumodd+dig;
			    }
			    num=num/10;
		       }
			if(sumeven%4==0 || sumodd%3==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	}
	}
}
