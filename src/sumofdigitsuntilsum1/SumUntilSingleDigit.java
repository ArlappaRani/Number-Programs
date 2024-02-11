package sumofdigitsuntilsum1;

public class SumUntilSingleDigit {
	public static void FindSum(int n)
	{
		int sum=0;
		
		while(n!=0)
		{
			
			
			int digit=n%10;
			n=n/10;
			sum=sum+digit;
		}
	       System.out.println(sum);
			
			
		
		
	}

}


