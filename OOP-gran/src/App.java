
// import java.util.Scanner;
import javax.swing.*;

public class App {

    // static means no need to initialize class to use method
    public static int getSum(int x, int y) {
        // public static int getSum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) throws Exception {
        // instance if method has no static
        // Main m = new Main();

        System.out.println("Hello, World!");
        String response;

        // create instance of Scanner class
        // Scanner input = new Scanner(System.in);

        // print then go new line
        // System.out.println("sup");

        // get string response from user
        response = JOptionPane.showInputDialog(null, "sup: ");
        // response = input.nextLine();

        // print then go new line
        System.out.println("how many times did you blink today?");

        // declare int variable and get user input as value
        int response2 = Integer.parseInt(JOptionPane.showInputDialog(null, "how many times did you blink today?"));
        // int response2 = input.nextInt();

        int response3 = Integer.parseInt(JOptionPane.showInputDialog(null, "how many times did you talk today?"));

        // print then go new line
        System.out.println("You said " + response + " and you did " + getSum(response2, response3) + " times today");
    }
}