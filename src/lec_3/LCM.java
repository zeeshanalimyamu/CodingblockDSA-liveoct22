package lec_3;

public class LCM {

	public static void main(String[] args) {
		int n1=4;
		int n2=6;
		int n3=n1*n2;
		int x=n2;
	    if(n2>n1 )
		while(x<=n3) {
			 
			  int rem1=x/n1;
			  int rem2=x/n2;
			  
			  if(rem1==0 && rem2==0) {
				   System.out.println(x);
			  }
		      x++;
		}
	}
}
