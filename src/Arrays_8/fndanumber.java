package Arrays_8;

import java.util.Scanner;

public class fndanumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
      
		for(int i=0; i<n ; i++) {
			arr[i]=scn.nextInt();}
		int num=scn.nextInt();
		
	     find(arr,num);
	     System.out.println(find(arr,num));
	
	}
    public static int find(int[]arr,int num) {
    	for(int i=0;i<arr.length;i++) {
    		if(num==arr[i]) {
    			return i;
    		} 
    	}
    	    return -1;		
    		
    		
    	
    		
    			
    		
    	
    	
    }
	
	
	
}
