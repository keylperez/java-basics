import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give radius of circle: ");
        
        double diameterHalf = input.nextDouble();

        final double pi = 3.14159;

        double area = diameterHalf * diameterHalf * pi;
        
        System.out.println("\nThe area for the circle of radius " + diameterHalf + " is " + area);
    }
}