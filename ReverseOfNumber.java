import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Methods obj = new Methods();
		int number = scanner.nextInt();
		System.out.println(obj.reverseInteger(number));
		 scanner.close();
	}
	
	

}
