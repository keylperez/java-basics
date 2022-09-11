import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // String something = "sup";

        // System.out.println(something);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        System.out.println("Enther the last number: ");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;
         
        System.out.println("The average of " + number1 + ", " + number2+ ", and " + number3 + " is " + average);
    }
}