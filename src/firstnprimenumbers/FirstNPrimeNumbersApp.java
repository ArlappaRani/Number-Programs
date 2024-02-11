package firstnprimenumbers;
import java.util.Scanner;
public class FirstNPrimeNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		FirstNprimeNumbers.prime(n);

	}

}
