package lec_8;

public class Arrays {
   public static void main(String[] args) {
	    int[] arr=new int[10];
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=3*(i+1);
	   }
	  for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
}
}
