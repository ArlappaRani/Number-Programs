package sumof.digitsof.numbers;
import java.util.Scanner;
public class SumOfDigitsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		SumOfDigits.Sum(num);

	}

}
