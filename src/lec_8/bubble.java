package lec_8;
import java.util.Arrays;
public class bubble {
   public static void main(String[] args) {
	int[] arr= {50,40,30,20,10};
	System.out.println(Arrays.toString(arr));
	bubble(arr);
}
   public static void bubble(int[]arr) {
	   for(int count=1;count<arr.length;count++) {
	   for(int s=0; s<=arr.length-1-count;s++) {
		   if(arr[s]>arr[s+1]) {
		   int temp=arr[s+1];
		    arr[s+1]=arr[s];
		     arr[s]=temp;
	   }
   } System.out.println(Arrays.toString(arr));
}}}
