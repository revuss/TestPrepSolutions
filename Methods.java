
public class Methods {

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
	
//	
	
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
	public String arrayToInteger(int[] arr) 
	{
		 StringBuilder sb = new StringBuilder();

	        for (int digit : arr) {
	            sb.append(digit);
	        }
	        String a = sb.toString();
	      
	        return a; 
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
