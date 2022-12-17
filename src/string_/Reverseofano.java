package string_;
import java.util.*;
public class Reverseofano {
   public static void main(String[] args) {
//	  String str="The sky is Blue";
	  
//	 System.out.println(str.lastIndexOf(" "));
	 String str= "nitin";
//	 System.out.println(str.substring(0,2));
//	 Revword(str);
//	 Subarray(str);
//     System.err.println(isPalin());
	 PalinSS2(str);
   }
	 public static void Revword(String str) {
	  while(true) {
	    int i=str.lastIndexOf(" ");
//	    System.out.println(str.indexOf("T"));  
	    String word=str.substring(i+1,str.length());
	    System.out.print(word+" ");
	       if(i==-1) {
	    	   break;
	       }
	         str= str.substring(0,i);
}}
   public static void Subarray(String str) {
	   
	     for(int s=0; s<str.length() ; s++) {
	    	 for(int e=s+1 ; e<=str.length();e++) {
	    		 System.out.println(str.substring(s,e));
	    	 }
	    	 
	     }
	   
   }

  public static boolean isPalin(String str) {
	   int s=0;
	   int e=str.length()-1;
	   while(s<e) {
		   if(str.charAt(s)==str.charAt(e)) {
			   s++;
			   e--;
		   } else {
			   return false;
		   }
		     
		   
		   
	   }
	   return true;
	  
  }
  
   public static void PalinSS(String str) {
	   for(int s=0; s<str.length() ; s++) {
	    	 for(int e=s+1 ; e<=str.length();e++) {
	    		 String ss=str.substring(s,e);
	    		 if(isPalin(ss)) {
	    		 System.out.println(ss);
	    	 }}
	    	 
	     }
   }
   
   public static void  PalinSS2(String str) {
	   for(int i=0;i<=str.length();i++) {
		    fn(str,i,i);
		    fn(str,i,i+1);
	   }
   }
   public static void fn(String str ,int L,int R) {
	  while(L>-1 && R<str.length()){ 
	      if( str.charAt(L)==str.charAt(R)) {
	    	 System.out.println (str.substring(L,R+1));
	    	 L--;
	    	 R++;
	      } else {
	    	  break;
	      }
//   }  System.out.println();
	  }
}}
 
