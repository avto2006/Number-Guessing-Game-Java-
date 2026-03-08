import java.util.Random;
import java.util.Scanner;


public class  GuessNumberGame {


     // Random number logic
     Random random = new Random();
     int min = 1;
     int max = 100;
     int randomNumber = random.nextInt(max - min + 1) + min; 


     // Scanner logic
      Scanner scanner = new Scanner(System.in);
      

     public static void main(String[] args) {
        System.out.println("Welcome to Number  Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        
        int userGuess = scanner.nextInt();
        System.out.println("Enter your guess number: " + userGuess);

        scanner.close();
     }
}