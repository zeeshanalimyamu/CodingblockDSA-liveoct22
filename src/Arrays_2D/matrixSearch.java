package Arrays_2D;

import java.util.*;

public class matrixSearch {
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] mat = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				mat[i][j] = scn.nextInt();
       
			}
		}
		int num=scn.nextInt();
		int ce = mat[0].length - 1;
		int rs = 0;
		int re = mat.length - 1; 
	while(rs<=re && ce>=0) {	
	  if(num> mat[rs][ce]) {
		     rs++;
	  } else if(num<mat[rs][ce]) {
		  ce--;
	  }else {
		 System.out.println("1");
	  }}
	   System.out.println("0");
		
	}
	
}
