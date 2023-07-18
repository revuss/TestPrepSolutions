import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
	
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		int arr[] = {54, 546, 548, 60};
		MinMaxNumbers obj = new MinMaxNumbers();
//	if in array order
		System.out.println(Arrays.toString(obj.findMinMaX5Sol(arr)));
		
//		else in single line without of String format
		for(int i:obj.findMinMaX5Sol(arr)) 
		{
			System.out.print(i+" ");
		}
		
	}
	
	public static int[] findMinMaX5Sol(int[] arr) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]<arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
			
		}
		
		return new int[] {arr[0],arr[arr.length-1]};
	}

}
