import java.util.Scanner;
class Question12{
	public static void main(String args[]){
		int best=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		
		int stdNo=sc.nextInt();
		int std[] = new int[stdNo+2];
		System.out.print("Enter "+stdNo+" scores: ");
		for(int i=0;i<stdNo;i++){
			std[i]=sc.nextInt();
			if(std[i]>best){
				best = std[i];
			}
		}
		for(int i=0;i<stdNo;i++){
			if(std[i] >= (best-10)){
				System.out.println("Student "+i+"score is "+std[i]+" and grade is A");
			}
			else if(std[i] >= (best-20)){
				System.out.println("Student "+i+"score is "+std[i]+" and grade is B");
			}
			else if(std[i] >= (best-30)){
				System.out.println("Student "+i+"score is "+std[i]+" and grade is C");
			}
			else if(std[i] >= (best-40)){
				System.out.println("Student "+i+"score is "+std[i]+" and grade is D");
			}
			else{
				System.out.println("Student "+i+"score is "+std[i]+" and grade is F");
			}
		}
		
	}
	
}