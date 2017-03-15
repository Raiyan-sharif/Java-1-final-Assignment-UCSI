import java.util.Scanner;
class Question11{
	public static void main(String args[]){
		System.out.print("Enter a new score: ");
		Scanner sc = new Scanner(System.in);
		int input[] = new int[101];
		input[0] = sc.nextInt();
		int count =0;
		while(input[count] >= 0){
			count++;
			System.out.print("Enter a new score: ");
			input[count] = sc.nextInt(); 
		}
		System.out.println("Count is "+count);
		int total=0;
		for(int i=0;i<count;i++){
			total += input[i];
		}
		double average = (double)total/count;
		System.out.println("Average is "+average);
		int ae=0,b=0;
		for(int i=0;i<count;i++){
			if(average >= input[i]){
				ae++;
			}
			else{
				b++;
			}
		}
		System.out.println("Number of scores above or equal to the average "+ae);
 		System.out.println("Number of scores below the average "+b);  
		
	}
}