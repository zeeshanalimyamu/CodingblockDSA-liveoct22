package lec_2;

import java.util.Scanner;

public class PrimeNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn=new Scanner(System.in);
            int num=scn.nextInt();
            int count=1;
            int factor=0;
          while(count<=num) {
        	  int rem=num%count;
        	  
        	   if(rem==0) {
        		   factor++;
        		   count++;
        	   }else {
        		   count++;
        	   }
          }
         if (factor==2) {
        	 System.out.println("Prime");
         }else {
        	 System.out.println("Not Prime");
         }
	}

}
