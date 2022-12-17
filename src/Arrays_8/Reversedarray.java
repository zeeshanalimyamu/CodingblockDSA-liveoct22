package Arrays_8;

import java.util.*;

public class Reversedarray {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
		
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
		    for(int j=arr.length-1;j>=0;j--) {
		    	System.out.println(arr[j]+" ");
		    }
			
}
}
