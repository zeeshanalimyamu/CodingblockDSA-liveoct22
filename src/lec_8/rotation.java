package lec_8;

public class rotation {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	print(arr);
	Rev(arr,44);
	print(arr);
}  
public static void print(int[] arr) {
	for(int element:arr) {
		System.out.print(element+" ");
	}
	System.out.println();
}
public static void Rev(int[] arr, int rot) {
	   rot = rot% arr.length;
	  for(int count=0; count<rot; count++) {
	   int temp=arr[arr.length - 1];
	  for(int i= arr.length - 2; i>=0; i--) {
		  arr[i+1]=arr[i];
	  }
      arr[0]=temp;
}
 
}}

