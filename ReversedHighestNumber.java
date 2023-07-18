import java.util.Arrays;
import java.util.Scanner;

public class ReversedHighestNumber {
	
	public static void main(String[] args) 
	{
		
		ReversedHighestNumber obj = new ReversedHighestNumber();
		
		int arr[] = {54, 546, 548, 60};
		
		System.out.println(obj.reversedBig(arr));
	}
	public String reversedBig(int[] arr) 
	{
		int left = 0;
		int right = arr.length-1;
		
		while(left <right) 
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			
			left++;
			right--;
		}
		String Output = arrayToInteger(arr);
		
		return Output;
	}
	public static String arrayToInteger(int[] arr) 
	{
		 StringBuilder sb = new StringBuilder();

	        for (int digit : arr) {
	            sb.append(digit);
	        }
	        String a = sb.toString();
	      
	        return a; 
	}
}
