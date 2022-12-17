package lec_6;

public class BostonNum {
    public static void main(String[] args) {
		int num=378;
		int count=2;
		int sum_p=0;
		int sum_d=0;
		int back_up=num;
		while(num>1) {
			if (num/count==0) {
				if(count>=10) {
					while(num>0) {
						   int dig1=count%10;
						   count=count/10;
						   sum_p=sum_p+dig1;
						   }}
				else  {
				sum_p=count+sum_p;
				num=num/count;
				}
				
			}else {
				count++;
			}
		}
	    num=back_up;
	   while(num>0) {
	   int dig=num%10;
	   num=num/10;
	   sum_d=sum_d+dig;
	   }
	   if(sum_p==sum_d) {
		   System.out.println("1");
	   }else {
		   System.out.println("0");
	   }
	}
    
}
