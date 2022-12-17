package pattern;

import java.util.Scanner;

public class pascaltriange {
    public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int row=0;
		int total_st=1;
	  while(row<N) {
		  
		    int cnt_st=0;
		    int num=1;
		    while(cnt_st<total_st) {
		    System.out.print(num+"\t");
		    num=num*(row-cnt_st)/(cnt_st+1);
		    cnt_st++;
		    
		    }
		  
		  
		  
		 System.out.println(); 
		 total_st++; 
		 row++; 
	  }
	}
}
