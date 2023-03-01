package codechumConstructor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter cat's name: ");
//        String str1 = sc.nextLine();
//        
//        System.out.print("Enter cat's color: ");
//        String str2 = sc.nextLine();
//        
//        System.out.print("Enter cat's gender: ");
//        char gender = sc.next().charAt(0);
//        
//        Cat cat = new Cat(str1, str2, gender);
//        System.out.print(cat);
        
        System.out.print("Enter bird's breed: ");
        String breed = sc.nextLine();
        System.out.print("Is bird nocturnal?: ");
        boolean nocturnal = sc.nextBoolean();
        
        Bird bird1 = new Bird();
        
        Bird bird2 = new Bird(breed, nocturnal);
        
        System.out.print(String.format("Breed: %s, Nocturnal: ", bird1.breed) + bird1.isNocturnal);
        System.out.print(String.format("Breed: %s, Nocturnal: ", bird2.breed) + bird2.isNocturnal);
        
        // NOTE: Uncomment the line below when you want to submit your solution already
//        Tester.test(cat);
    }
}
