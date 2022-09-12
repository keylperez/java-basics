import java.util.Scanner;
import java.lang.Math;

public class monthlyPayment{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the interest: ");
        double interest = input.nextDouble();

        System.out.println("Enter the number of years: ");
        double years = input.nextDouble();

        System.out.println("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = (loanAmount * interest)/(1-(1/Math.pow(1+interest, years*12)));

        System.out.println("The monthly payment is " + monthlyPayment);
    }
}