import java.util.Random;
import java.util.Scanner;
class Question6{
	
	public static void main(String args[]){
		int computer = new Random().nextInt(3);
		int w=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int my = sc.nextInt() ;
		System.out.print("The computer is ");
		if(computer == 0 && my == 0){
			System.out.print("scissor. You are scissor. Match draw.");
		}
		else if(computer == 1 && my == 0){
			System.out.print("rock. You are scissor. Computer won.");
		}
		else if(computer == 2 && my == 0){
			System.out.print("paper. You are scissor. You won.");
		}
		else if(computer == 0 && my == 1){
			System.out.print("scissor. You are rock. You won.");
		}
		else if(computer == 1 && my == 1){
			System.out.print("rock. You are rock. Match draw.");
		}
		else if(computer == 2 && my == 1){
			System.out.print("paper. You are rock. Computer won");
		}
		else if(computer == 0 && my == 2){
			System.out.print("scissor. You are paper. Computer won.");
		}
		else if(computer == 1 && my == 2){
			System.out.print("rock. You are paper. You won.");
		}
		else if(computer == 2 && my == 2){
			System.out.print("paper. You are paper. Match draw");
		}
		System.out.println();
	}
	
}