import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) 
	{
		Reverse_string obj = new Reverse_string();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(obj.reversedString(str));
		
	}
	public String reversedString(String word) 
	{
		char[] charArray = word.toLowerCase().toCharArray();
		
		int left = 0;
		int right= charArray.length-1;
		while(left <right) 
		{
			char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
			
		}
		String resultedString = new String(charArray);
		return resultedString;
	}

}

