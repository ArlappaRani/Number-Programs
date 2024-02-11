package factorialNumber;
import java.util.Scanner;
public class FactorialNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		FactorialNumber fn=new FactorialNumber();
		fn.DisplayFact( Num);

	}

}
