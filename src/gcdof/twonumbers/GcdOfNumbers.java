package gcdof.twonumbers;

public class GcdOfNumbers {
	public static void FindGcd(int num1,int num2)
	{
		int Gcd=1;
		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				Gcd=i;
			}
		}
		System.out.println(Gcd);
		
		
	}

}
