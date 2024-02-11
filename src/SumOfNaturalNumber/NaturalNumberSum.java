package SumOfNaturalNumber;

public class NaturalNumberSum {
	public int DisplaySumOf(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			
			
				sum=sum+i;
			
		}
		System.out.println(sum); 
		return sum;
	}
}
