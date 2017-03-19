import java.util.Scanner;
public class Question13{
	
	public static double sumMajorDiagonal(double m[][]){
		double sum=0.0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(i==j){
					sum = sum + m[i][j];
				}
			}
		}
		return sum;
		
	}
	public static void main(String args[]){
		double matrix[][] = new double[4][4];
		double sum=0;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a 4 by 4 matrix row by row:");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				matrix[i][j] = sc.nextDouble();
				//sumMajorDiagonal(matrix[i][j]);
				
			}
		}
		
		sum = sumMajorDiagonal(matrix);
		System.out.println("Sum of the elements in the major diagonal is "+sum);
	}
	
}
	