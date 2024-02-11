package ProductOddNumbers;
import java.util.Scanner;
public class OddProductNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		OddProductNumber Op=new OddProductNumber();
		Op.DisplayOdd(Num);
		

	}

}
