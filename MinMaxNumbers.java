import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
	
	public static void main(String[] args) 
	{
		int arr[] = {54, 546, 548, 60};
		Methods obj = new Methods();
//	if in array order
		System.out.println(Arrays.toString(obj.findMinMaX5Sol(arr)));
		
//		else in single line without of String format
		for(int i:obj.findMinMaX5Sol(arr)) 
		{
			System.out.print(i+" ");
		}
		
	}
	


}
