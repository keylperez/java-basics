// Create a Program that will the user guess a number. The number will
// be a random integer from 1-100. You will initially show a hint
// whether the number is odd or even.
// The user will have 5 chances.
// If the guess is incorrect, tell the user if the number is higher or lower.
// Otherwise, show that the user is correct.

import java.util.Scanner;

public class numberGuessing {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int count = 0;
        boolean isOdd = number % 2 != 0;
        System.out.println("The number is " + (isOdd ? "odd" : "even"));
        while (guess != number && count < 5) {
            System.out.println("Enter a guess: ");
            guess = input.nextInt();
            if (guess > number) {
                System.out.println("The number is lower");
            } else if (guess < number) {
                System.out.println("The number is higher");
            }
            count++;
        }
        if (guess == number) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You are out of guesses");
        }
    }
}