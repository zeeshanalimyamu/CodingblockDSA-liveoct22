package Arrays_2D;
import java.util.*;
public class spiral {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 },
				        { 50, 51, 53, 55 }, 
				        { 63, 66, 67, 73 }, 
				        { 86, 87, 88, 89 }, 
				        { 90, 92, 93, 94 }};
		int [][] arr1= {{10},{20},{30},{40}};
		spiral(arr1);
		spiral(arr);
		System.out.println(Find(arr,51));
		System.out.println(arr [2] [3]);
//	        in arr[2] address is stored
		System.out.println(arr[2]);
		System.out.println(arr.length);
	    System.out.println(arr[0].length);
	}

	public static void spiral(int[][] mat) {
		int cs = 0;
//		we use mat[0] bcz it gives us no of rows;
		int ce = mat[0].length - 1;
		int rs = 0;
		int re = mat.length - 1;
		int count=0;
		int maxm= mat.length*mat[0].length;
     while(re>=rs && ce>=cs) {
		for (int r = rs; r <= re && count <maxm; r++ ) {
			
			System.out.print(mat[r][cs] + " ");
			count++;
		
		}
		System.out.println();
		for (int c = cs + 1; c <= ce && count <maxm; c++) {
			System.out.print(mat[re][c] + " ");
			count++;
		}
		System.out.println();
		for (int r = re - 1; r >= rs  && count <maxm; r--) {
			System.out.print(mat[r][ce] + " ");
			count++;
		}
		System.out.println();
		for (int c = ce - 1; c >= cs + 1 && count <maxm; c--) {
			System.out.print(mat[rs][c] + " ");
			count++;
		}System.out.println();
        rs++;
        re--;
        cs++;
        ce--;
	}}

      
     public static boolean Find(int[][] mat,int num) {
//		    int cs = 0;
			int ce = mat[0].length - 1;
			int rs = 0;
			int re = mat.length - 1; 
		while(rs<=re && ce>=0) {	
		  if(num> mat[rs][ce]) {
			     rs++;
		  } else if(num<mat[rs][ce]) {
			  ce--;
		  }else {
			  return true;
		  }}
		 return false; 
	  }
	}
