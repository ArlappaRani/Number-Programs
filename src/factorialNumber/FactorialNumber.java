package factorialNumber;

public class FactorialNumber {
	public int DisplayFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
			System.out.println(fact);
		
		return fact;
	}

}
