package sumofsquares;

public class FindSumOfSquares {
	public static void FindSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i;
		}
		System.out.println(sum);
	}

}
