import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) 
	{
		Methods obj = new Methods();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(obj.reversedString(str));
		
	}

}

