import java.util.Scanner;
class Question8{
	
	public static void main(String args[]){
		
		System.out.print("Enter the number of students: ");
		Scanner sc = new Scanner(System.in);
		int max =0;
		String maxName="";
		int stdNo = sc.nextInt();
		String name[] = new String[stdNo+1];
		int score[] = new int[stdNo+1];
		for(int i=0;i<stdNo;i++){
			System.out.print("Enter a student name: ");
			name[i]=sc.next();
			//name[i] = System.console().readLine();
			System.out.print("Enter a student score: ");
			score[i] = sc.nextInt();
			if(score[i]>max){
				max = score[i];
				maxName = name[i];
				
			}
		}
		System.out.println("Top student "+maxName+"'s score is "+(double)max);
		
	}
}