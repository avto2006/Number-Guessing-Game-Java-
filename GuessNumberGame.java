import java.util.Random;
import java.util.Scanner;


public class  GuessNumberGame {


     // Random number logic
   


    
     
      

     public static void main(String[] args) {

          Random random = new Random();
          int min = 1;
          int max = 100;
          int randomNumber = random.nextInt(max - min + 1) + min; 

        System.out.println("Welcome to Number  Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        
         // Scanner logic
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0;

        while (userGuess != randomNumber) {
            System.out.println("Enter your guess number: " + userGuess);
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low");
            } else if(userGuess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct!");
            }
        }
       
        

        scanner.close();
     }
}