package lec_2;

import java.util.Scanner;

public class fibonaaci_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn=new Scanner(System.in);
           int nth=scn.nextInt();
           int a=0;
           int b=1;
           int c=0;
           int Count=1;
           while(Count<=nth) {
        	   c=a+b;
        	   a=b;
        	   b=c;
        	   Count++;
           
        		   
	}
           System.out.println(a);

}}
