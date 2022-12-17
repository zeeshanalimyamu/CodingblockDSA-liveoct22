package Arrays_8;

import java.util.Arrays;

public class REvision {
	public static void main(String[] args) {

		int[] arr = { 8, 2, -12, 4, 5 };

	
	 for(int last_idx = 1; last_idx<=arr.length-1;last_idx++) {
			int   ali = arr[last_idx ];
			int   idx=last_idx-1;
			while( idx>=0 && arr[idx]>ali ) {
				arr[idx+1]=arr[idx];
				idx--;
			}
		        arr[idx+1]=ali;	
			
	 }
	 System.out.println(Arrays.toString(arr)); 
	 }
     
	  int max=arr.length-1;
	  for
		
	}

