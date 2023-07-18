import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReverseOfNumber obj = new ReverseOfNumber();
		int number = scanner.nextInt();
		System.out.println(obj.reverseInteger(number));
		 scanner.close();
	}
	
	public int reverseInteger(int number) 
	{
		 int reverse = 0;
	        while (number > 0) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number /= 10;
	        }
	        return reverse;
	}	

}
