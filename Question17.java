import java.util.Random;
public class Question17{
   public static void main(String []args) {
        // TODO code application logic here
       Random rand = new Random(1000);
        for (int i = 0; i <= 50; i++) {
            System.out.printf(rand.nextInt(100) + " "); 
                System.out.println();
         }
 }
}

    