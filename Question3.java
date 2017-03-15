import java.util.Scanner;
class Question3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minute=sc.nextInt();
		int year=0,days=0;
		int temp=minute;
		int yearTemp = 60*24*365;
		int daysTemp = 60*24;
		//System.out.println();
		for(int i=0;yearTemp<=temp;i++){
			year = year+1;
			temp = temp - yearTemp; 
		}
		for(int i=0;daysTemp<=temp;i++){
			days++;
			temp = temp - daysTemp; 
		}
		System.out.println(minute+" minutes is approximately "+year+" years and "+days+" days");
		
	}
}