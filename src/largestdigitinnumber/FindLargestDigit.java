package largestdigitinnumber;

public class FindLargestDigit {
	public static void LargestNumber(int n)
	{
		int max=0;
		int count=0;
		while(n!=0)
		{
			int digit=n%10;
		     n=n/10;
		     count++;
		     if(digit>max)
		     {
		    	 max=digit;
		     }
		     System.out.println(digit);
		     
			
		}
	}

}
