package Arrays_2D;

import java.util.*;

public class Piyushamagicalpark {
   public static void main(String[] args) {
	   Scanner scn=new Scanner(System.in);
	   int r=scn.nextInt();
	   int c=scn.nextInt();
	String[][] park= new String[r][c];
	for(int i=0;i<r ;i++) {
		for(int j=0; j<c ;j++) {
//	for string we use this 
		park[i][j]=scn.next();	
			
		}
	}
	int minm=scn.nextInt();
	int s=scn.nextInt();
	   
	int  finalstrength=finalS(r,c,minm,s,park);
    if(finalstrength>minm) {
    	System.out.println("yes");
    	System.out.println(finalstrength);
    	
    } else {
    	System.out.println("No");
    	System.out.println(finalstrength);
    }
}
   public static int finalS(int r ,int c,int minm,int s,String[][] park) {
	  for(int i=0;i<r ;i++) {
		  for(int j=0; j<c;j++) {
			  String value=park[i][j];
			  if(s<minm) {
				  return s;
			  }
	      switch(value) {
	      case "." : s=s-2; break;
	      case "*" : s=s+2; break;
	      case "#" : j=c-1;
	      
	      
	      }
	      if (j != c - 1) {
              s--;
          }  
		  }
	  }
	  return s;
   }
   
}
