import java.util.Scanner;
class Question5{
	public static void main(String agrs[]){
		Scanner sc=new Scanner(System.in);
		System.out .print("Enter three integers: ");
		int i[] = new int[3];
		i[0] = sc.nextInt();
		i[1] = sc.nextInt();
		i[2] = sc.nextInt();
		System.out.print("The integers in decreasing order is ");
		if(i[0]>i[1] && i[0]>i[2] && i[1]>i[2]){
		
			
		}
		else if(i[0]>i[1] && i[0]>i[2] && i[2]>i[1]){
			int temp;
			temp = i[1];
			i[1] = i[2];
			i[2] = temp;
			
		
		}
		else if(i[1]>i[0] && i[1]>i[2] && i[0]>i[2]){
			int temp;
			temp = i[0];
			i[0] = i[1];
			i[1] = temp;
			
		}
		else if(i[1]>i[0] && i[1]>i[2] && i[2]>i[0]){
			int temp;
			temp = i[0];
			i[0] = i[1];
			i[1] = i[2];
			i[2] = temp;
		}
		else if(i[2]>i[0] && i[2]>i[1] && i[1]>i[0]){
			int temp;
			temp = i[0];
			i[0] = i[2];
			i[2] = temp;
		}
		else if(i[2]>i[0] && i[2]>i[1] && i[0]>i[1]){
			int temp;
			temp = i[0];
			i[0] = i[2];
			i[2] = i[1];
			i[1] = temp;
		}
		System.out.print(i[0]+", ");
		System.out.print(i[1]+", ");
		System.out.println(i[2]+".");
	
			
		
	}
}