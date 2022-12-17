package lec_4;

public class pattern3 {
 public static void main(String[] args) {
	int n=5;
	int row=1;
	int total_st=5;
	int total_sp=1;
	int total_st1=5;
	
	while(row<=2*n-1)
	{
		int cnt_st=1;
		while(cnt_st<=total_st) {
			System.out.print("*");
			cnt_st++;
		   }
		 if(1<row || row<2*n-1)
		 {
		 int cnt_sp=2;
		 while(cnt_sp<total_sp) {
			 System.out.print(" ");
			 cnt_sp++;
		 }}
		 int cnt_st1=2;
			while(cnt_st1<=total_st1) {
				System.out.print("*");
				cnt_st1++;
			}
		if(1<row && row<n) {
			total_st1--;
		}
		if(row>=n && row<2*n-2) {
			total_st1++;
		}
		if(row<n) {
			total_st--;
			total_sp=total_sp + 2;
		} else {
			total_st++;
			total_sp=total_sp - 2;
			
		}
		
		System.out.println();
		row++;
	}
}
}
