package lec_3;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n1=18;
           int n2=24;
           while(n1>0) {
        	   int rem = n2%n1;
        	      n2=n1;
        	      n1=rem;
        	   if(n1==0) {
        		   System.out.println(n2);
        	   }
        	   
           }
	}

}
