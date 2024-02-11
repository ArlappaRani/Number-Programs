package ProductOddNumbers;

public class OddProductNumber {
	public int DisplayOdd(int n)
	{
		
	
	     int a=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			    a=a*i;
		}	
				System.out.println(a);
			
		
		
	
		
		return a;
	}

}
