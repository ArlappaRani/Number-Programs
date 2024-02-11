package SumOfNaturalNumber;
import java.util.Scanner;
public class NaturalNumberSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int Num=sc.nextInt();
		NaturalNumberSum ns=new NaturalNumberSum();
		ns.DisplaySumOf(Num);

	}

}
