import java.util.Scanner;
class Question16{
	public static int countLetters(String s){
		int counter=0;
		 for(int i=0;i<=s.length()-1;i++){
		    if(Character.isLetter(s.charAt(i))){
			    counter++;
			    }
		    }
            return counter;
	}
	public static void main(String agrs[]){
		String s;
		System.out.print("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		s = sc.nextLine();
		int length = countLetters(s);
		System.out.println("The number of letters is "+length);
	}
}
	