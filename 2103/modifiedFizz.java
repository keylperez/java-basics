// Create a Program that accepts an integer input n. The program will display
// all integers from 1 until n.
// Conditions:
// if the number is divisible by 3; print out Fizz.
// If the number is divisible by 5; print Buzz
// If the number is divisible divisible by 3 and 5; skip, don’t print anything.
// Otherwise print the number
// Ex: Input: 16 Output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 16

import java.util.Scanner;

public class modifiedFizz { 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}