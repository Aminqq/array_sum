package array_sum;

public class array_sum {

	//Java Sum Values Inside An Array
	public static void main(String[] args) {
		
		int []array = {1, 2, 3};
		
		int sum = 0;
		/* 0+1, 1+2 , 3+3 */
		for(int  i=0; i<array.length; i++) {
			
			sum+= array[i];
		}
		
		System.out.println(sum);

  }
}
