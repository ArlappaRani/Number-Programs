package checkpalindrome;
import java.util.Scanner;
public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
	int res	=Palindrome.CheckPalindrome(num);
	if(res==num)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	    
		
	
	
			


	}

}
