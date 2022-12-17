package lec_8;

public class rot1 {
	
public static void main(String[] args) {
	

		int[] arr= {10,20,30,40,50};
		
		print(arr);
//		Rot1(arr);
		solve(arr,1007);
		print(arr);
}
 public static void solve(int[]arr,int rot) {
		rot=rot%arr.length;
		
		rev(arr,0,arr.length-1);
		print(arr);
		rev(arr,0,rot-1);
		rev(arr,rot,arr.length-1);
		
	}  
public static void print(int[] arr) {
		for(int element:arr) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void Rot1(int[] arr) {
//		   rot = rot% arr.length;
//		  for(int count=0; count<rot; count++) {
		   int temp=arr[arr.length - 1];
		  for(int i= arr.length - 2; i>=0; i--) {
			  arr[i+1]=arr[i];
		  }
	      arr[0]=temp;
	   
	      }
	  public static void rev(int []arr,int l, int r) {
		
		  while(l<r) {
			  int temp=arr[l];
			  arr[l]=arr[r];
			  arr[r]=temp;
			  l++;
			  r--;
			  
		  }
	  }
	}


