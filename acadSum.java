import java.util.Scanner;
public class acadSum {
	private static int Sum(int x , int y){
		return(x + y);
		    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a : " );
		int a = scan.nextInt();

		System.out.println("Enter value for b : " );
		int b = scan.nextInt();

		System.out.println("First Number is  " + a );
		System.out.println("Second Number is  " + b );
		System.out.println("Sum is  " + Sum(a,b));



	}

}
