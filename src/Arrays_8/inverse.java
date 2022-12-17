package Arrays_8;
import java.util.*;
public class inverse {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int [] arr=new int[n];
	for(int i=0;i<n ; i++) {
		arr[i]=scn.nextInt();
	}
	Reverse(arr,n);
	
 }	
   public static void Reverse(int[]arr,int n) {
	     int [] Rarr=new int[n];
	     for(int i=0;i<n;i++) {
	    	 Rarr[arr[i]]=i;
	     }
	     for(int i=0;i<n;i++) {
	    	 System.out.print(arr[i]+" ");
	     }
   }

}
