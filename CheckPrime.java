import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) 
	{
		Methods obj = new Methods();
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
	

}
