package findpowerofnumber;
import java.util.Scanner;
public class PowerRaisedToNApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Base");
		int base=scan.nextInt();
		System.out.println("Enter the exponent");
		int n=scan.nextInt();
		PowerRaisedToN.power(base, n);

}
}

