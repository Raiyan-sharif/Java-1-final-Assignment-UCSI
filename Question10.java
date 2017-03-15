import java.util.Scanner;
class Question10{
	
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		return fahrenheit;
	}
	
	public static double fahrenheitToCelsius(double  fahrenheit){
		double temp = fahrenheit - 32.0;
		double celsius = (5.0 / 9.0) * temp ;
		
		return celsius;
	}
	
 	public static void main(String args[]){
  		System.out.println("Celsius			Fahrenheit		|	Fahrenheit			Celsius");
  		System.out.println("---------------------------------------------------------------------------------------------");
		int x=10;
		int y=90;
  		while(x>0 && y>=0){
			System.out.println((double)x+"			"+celsiusToFahrenheit((double)x)+"		|		"+(double)y+"			"+fahrenheitToCelsius((double)y));
			x--;
			y-=10;
		}
  	}
 
}    