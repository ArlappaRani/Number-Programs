package checkpalindrome;

public class Palindrome {
	public static int CheckPalindrome(int num)
	{
		int reverse=0;
	     while(num!=0)
	{
	    	 
		int digit=num%10;
		num=num/10;
		reverse=reverse*10+digit;
	
	}
	     return reverse;

	}
}

