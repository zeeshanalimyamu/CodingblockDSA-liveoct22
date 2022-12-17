package Arrays_8;

import java.util.*;

public class Findanelement {
    public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    int N=scn.nextInt();
	    int[] arr= new int[N];
	    for(int i=0; i<N ; i++) {
	    	 arr[i]=scn.nextInt();
	    }
	    int find=scn.nextInt();
	    int count=0;
	    for(int ali:arr) {
	    	if(ali==find) {
	    		count++;
	    	}
	    }
	    
	    System.out.println(count); 
	}
}
