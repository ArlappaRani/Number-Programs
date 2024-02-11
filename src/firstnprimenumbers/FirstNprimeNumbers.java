package firstnprimenumbers;

public class FirstNprimeNumbers {
	public static void prime(int n)
	{
		for(int i=1;i<=n;i++)
		{
		if(n%1==0 && n%i==0)
		{
			System.out.print(i+" "); 
		}
	}

}
}
