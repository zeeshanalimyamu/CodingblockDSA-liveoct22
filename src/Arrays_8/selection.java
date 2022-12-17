package Arrays_8;
import java.util.*;
public class selection {
    public static void main(String[] args) {
//		In selection of array basically we select an element and
//		put that at last position
       int[] arr= {50,40,30,20,10};
       selection(arr);
       System.out.println(Arrays.toString(arr));
    }
     public static void selection(int[]arr) {
      
    	for( int last_idx=arr.length -1 ;last_idx>=1;last_idx--) {
    	for (int i=0; i<=last_idx-1;i++) {
    		int max=last_idx;
    	 if(arr[i]>arr[max]) {
    		   max=i;
    	 }
    	 int temp=arr[last_idx];
    	 arr[last_idx]=arr[max];
    	 arr[max]=temp;
    	 
     }}
     }   	
}
