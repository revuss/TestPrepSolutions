import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) 
	{
		CheckPrime obj = new CheckPrime();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(obj.isPrime(number)) 
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
		
	}
	
	public boolean isPrime(int number) 
	{
		if(number<=1) 
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) 
		{
			if(number%i==0) 
			{
				return false;
			}
		}
		return true;
	}
}
