package Arrays_8;

import java.util.*;

public class shopkeeper {
 public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	    int N=scn.nextInt();
	    int[] arr= new int[N];
	    for(int i=0; i<N ; i++) {
	    	 arr[i]=scn.nextInt();
	    }
	    int n=scn.nextInt();
	    int[] price=new int[n];
	    int[] items=new int[n];
	    for(int j=0;j<n ;j++) {
	        price[j]=scn.nextInt();
	        items[j]=scn.nextInt();
	    }
	    for(int j=0;j<n ;j++) {
	    	int cnt=0;
	     for(int i=0; i<N ; i++) {
	    	if(price[j]%arr[i]==0) {
	    		cnt++;
	    	}
	    }
	     if(cnt>=items[j]) {
	    	 System.out.println("Yes");
	     }else {
	    	 System.out.println("No");
	     }
	     
	    }
}
}
