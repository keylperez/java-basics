package randoms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student stud = new Student(18104944, "William", "BSCS", 3);
		stud.displayStud();

		MyTime t = new MyTime(3, 45, 0, "AM");

		t.displayTime();
		t.tickBySecond();
		t.displayTime();
		t.tickByMinute();
		t.displayTime();
		t.tickByHour();
		t.displayTime();

		MyTime t2 = new MyTime(12, 59, 58, "AM");
		t2.displayTime();
		t2.tickBySecond();
		t2.displayTime();
		t2.tickByMinute();
		t2.displayTime();
		t2.tickByHour();
		t2.displayTime();
		
		Scanner input = new Scanner(System.in);


        System.out.print("Enter blender version: ");
        int version = input.nextInt();

        Blender blinding = new Blender();

        String fruit1;
        String fruit2;
        
        switch(version){
            case 1:
                blinding.blend();
                break;
            case 2:
                System.out.print("Enter first fruit: ");
                fruit1 = input.nextLine();
                System.out.print("\nEnter second fruit: ");
                fruit2 = input.nextLine();
                blinding.blend(fruit1, fruit2);
                break;
            case 3:
                System.out.print("Enter first fruit: ");
                fruit1 = input.nextLine();
                System.out.print("\nEnter second fruit: ");
                fruit2 = input.nextLine();
                System.out.print("Enter times to blend: ");
                int n = input.nextInt();
                blinding.blend(fruit1, fruit2, n);
                break;
            default:
                System.out.println("Error");
                break;
        }
	}
}
