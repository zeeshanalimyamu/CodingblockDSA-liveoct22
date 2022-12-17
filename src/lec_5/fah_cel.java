package lec_5;

import java.util.Scanner;

public class fah_cel {
public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int MinF=scn.nextInt();
	  int step=scn.nextInt();
	  int MaxF=scn.nextInt();
	  
	  while(MinF<=MaxF) {
		  // here 5/9 bcm zero so we change it into decimal then typecast it into int
		  //for typecasting we use bracket in whole thing;
		  int Celcious=(int) (5/9.0*(MinF-32));
		  System.out.println(MinF+"\t"+ Celcious);
		  MinF=MinF+step;
		  
	  }
}
}
