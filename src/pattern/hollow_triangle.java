package pattern;

import java.util.*;

public class hollow_triangle {
 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int total_st=n;
	int total_st1=n-1;
	int total_sp=1;
	for(int row=0; row<(2*n-1);row++) {
		
		
	    for(int cnt_st=0;cnt_st<total_st;cnt_st++) {
	    	System.out.print("*"); }
	    if(row>0) {
	    for(int cnt_sp=0;cnt_sp<total_sp;cnt_sp++) {
	    	System.out.print(" ");
	    }}
	    for(int cnt_st=0;cnt_st<total_st1;cnt_st++) {
	    	System.out.print("*"); }
	   
	    if(row>0) { 
	    if(row<n-1) {
	    total_sp=total_sp+2;}
	    else {
	    	total_sp=total_sp-2;
	    }}
	   if(row>=1 && row<2*n-3) {
	   if(row>=n-1) {
		   total_st1++;}
		   else {
			   total_st1--;
		   }}
	   if(row>=n-1) {
	   total_st++;}
	   else {
		   total_st--;
	   }
	   System.out.println();	
	}
	
}
}
