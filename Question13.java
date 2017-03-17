import java.util.Scanner;
class Question13{
	public static void main(String args[]){
		int matrix[][] = new int[4][4];
		int sum=0;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a 4 by 4 matrix row by row:");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				matrix[i][j] = sc.nextInt();
				if(i==j){
					sum+= matrix[i][j];
				}
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+(float)sum);
	}
	
}
	