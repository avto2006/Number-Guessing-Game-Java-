import java.util.Random;



public class  GuessNumberGame {

     Random random = new Random();
     int min = 1;
     int max = 100;
     int randomNumber = random.nextInt(max - min + 1) + min; 
     public static void main(String[] args) {
        System.out.println("Welcome to Number  Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
     }
}