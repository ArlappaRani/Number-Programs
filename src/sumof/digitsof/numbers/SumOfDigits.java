package sumof.digitsof.numbers;

public class SumOfDigits {
	public static void Sum(int n) 
	{
		int sum=0;
		while(n!=0) 
		{
			int digit=n%10;//taking for removing the digits
			n=n/10;//taking the quotient values and dividing by 10 and storing
			sum=sum+digit;//adding digits into sum
		}
		System.out.println("The sum of digits are:"+sum);
		
	}

}
