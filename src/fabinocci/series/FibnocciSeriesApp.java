package fabinocci.series;
import java.util.Scanner;
public class FibnocciSeriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
        int fib1=0;
        
        int fib2=1;
        System.out.println("Enter the number");
        int n=scan.nextInt();
        
        FebinocciSeries.displayfeb(fib1,fib2,n);
	}

}
