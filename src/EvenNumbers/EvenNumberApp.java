package EvenNumbers;
import java.util.Scanner;
public class EvenNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int Num=sc.nextInt();
		EvenNumber En=new EvenNumber();
		En.displayEven(Num);

	}

}
