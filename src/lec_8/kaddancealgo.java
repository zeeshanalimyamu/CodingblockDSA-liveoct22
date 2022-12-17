package lec_8;

public class kaddancealgo {
  public static void main(String[] args) {
	int[] arr= {-10,20,30,-40};
	maxm(arr);
}
  public static void maxm (int[]arr) {
	  int sum=0;
	  int ans=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++) {
	    
	   sum=sum+ arr[i];
	   ans=Math.max(sum, ans);
	   if(sum<=0) {
		   sum=0;
	   }
	  
} System.out.println(ans);
  }}
