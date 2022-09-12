import java.util.Scanner;

public class displayTime{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(minutes + " minute(s) " + remainingSeconds + " second(s)");
    }
}