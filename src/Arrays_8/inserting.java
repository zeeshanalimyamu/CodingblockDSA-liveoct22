package Arrays_8;

import java.util.Arrays;

public class inserting {
	public static void main(String[] args) {
		int[] arr = { 16,1,0,9,100 };
		Inserting(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void Inserting(int[] arr) {
		
	for(int last_idx = 1; last_idx<=arr.length-1;last_idx++) {
	int   ali = arr[last_idx ];
	int   idx=last_idx-1;
	while( idx>=0 && arr[idx]>ali ) {
		arr[idx+1]=arr[idx];
		idx--;
	}
        arr[idx+1]=ali;
}}
}