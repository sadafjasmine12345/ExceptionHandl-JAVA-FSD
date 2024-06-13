import java.util.Scanner;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quotient,dividend,divisor;
		Scanner scnr=new Scanner(System.in);
		try {
			System.out.println("Enter dividend");
			dividend=scnr.nextInt();
			System.out.println("Enter divisor");
			divisor=scnr.nextInt();
			quotient=dividend/divisor;
			System.out.println("Quotient=+quotient");
		}catch(ArithmeticException arthexcp) {//obj is thrown by jvm in this any type of code we write
		System.out.println(arthexcp);
			System.err.println(arthexcp.getMessage()); //arthexcp is reference of arthmeticException object
			
		}

	}

}
