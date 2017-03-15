import java.util.Scanner;
class Question9{
	public static void reverse(int input){
		
		String temp = Integer.toString(input);
		int l = temp.length();
		char[] stringArray = temp.toCharArray();
		for(int i=l-1; i>=0;i--){

			System.out.print(stringArray[i]);
		}
		
		System.out.println();
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = sc.nextInt();
		Question9.reverse(input);
		
	}
	
}