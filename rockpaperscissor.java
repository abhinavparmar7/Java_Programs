import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your Name : ");
         String userName = sc.next();
         System.out.print("\n0 for Rock. \n1 for Paper.\n2 for Scissor.\nIt`s "+userName+"`s Turn : ");
         int userInput = sc.nextInt();
         sc.close();
         Random random = new Random();
         int computerInput = random.nextInt(3);
         
         if(userInput == computerInput) {
            System.out.println("Draw");
         }
         else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0|| userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
         }
         else {
            System.out.println("Computer Win!");
         }
         System.out.println("Computer Choise : " + computerInput);
    }
}

