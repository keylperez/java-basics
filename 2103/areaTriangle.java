import java.util.Scanner;

public class areaTriangle{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is " + area);
    }}