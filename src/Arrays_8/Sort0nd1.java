package Arrays_8;

import java.util.Scanner;

public class Sort0nd1 {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	int Str_idx=0;
	int idx=arr.length-1;
	for(int j=0;j<n;j++) {
		int num=arr[j];
	while(Str_idx<=idx) {
		if(num==0) {
			arr[Str_idx]=num;
			Str_idx++;
		} else {
			arr[idx]=num;
			idx--;
		}
	}}
	
	
	for(int k=0;k<n;k++) {
		System.out.print(arr[k]+" ");
	}
   
   }
}
