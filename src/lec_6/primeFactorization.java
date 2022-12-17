package lec_6;

public class primeFactorization {
    public static void main(String[] args) {
		int num=12;
		int count=2;
		while(num>1) {
			if(num%count==0) {
				System.out.print(count+" ");
				num=num/count;
			}else {
				count++;
			}
		
		}
	}
}
