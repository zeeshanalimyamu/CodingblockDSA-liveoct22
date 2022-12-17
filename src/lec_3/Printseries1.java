package lec_3;

public class Printseries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int N1=10;
             int N2=4;
             int n=1;
             int count=1;
            while(count<=N1) {
            	 int term=3*n+2;
            	 int rem=term%N2;
                  n++;
                     
                 if(rem!=0) {
                	 System.out.println(term);
                	 count++;
                 }
            }
	}

}
