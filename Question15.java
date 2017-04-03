import java.util.Scanner;
public class Question15 {
    public static final int PASSWORD_REQUIRED_LENGTH = 8;
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print (
                "-Password must have at least 8 characters.\n" +
                "-Password consists of only letters ans digits.\n" +
                "-Password must contain at least 2 digits \n" +
                "Enter a password meeting the requiremenets above: ");
        String s = input.nextLine();
        
        if (isValidPassword(s)) {
            System.out.println(" Valid Password!");
        } else {
            System.out.println("Invalid Password!");
        }
        

    }
    public static boolean isValidPassword(String Password) {
        
        if (Password.length() < PASSWORD_REQUIRED_LENGTH) return false;
        
        int chartCount = 0;
        int numCount = 0;
        for (int i = 0; i < Password.length(); i++) {
            char ch= Password.charAt (i);
            if (isNumeric(ch)) numCount++;
            else if (isLetter(ch)) chartCount++;
            else return false;
        }
        return (chartCount >= 2 && numCount >=2);
    }
    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase (ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean isNumeric (char ch) {
        return (ch >= '0' && ch <= '9');
    }
    
}