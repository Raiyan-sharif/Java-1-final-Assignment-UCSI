import java.util.Scanner;
import java.text.DecimalFormat;
class Question4{
	public static void main(String agrs[]){
		double interest;
		double balance;
		double annualInterestRate;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = sc.nextDouble();
		annualInterestRate = sc.nextDouble();
		interest = balance * (annualInterestRate / 1200);
		DecimalFormat df = new DecimalFormat("0.00000"); 
		System.out.print("The interest is "+df.format(interest));
		
	}
}