package src.classes;

public class Main {
	
    public static void main(String[] args) {
        // Student s1 = new Student();

        // Student s2 = new Student();

        // s2.setSTudID(1002);
        // s2.studName = "John";
        // // s2.program = ;
        // s1.displayStud();

        MyTime t = new MyTime(3, 45, 0, "AM");

        t.displayTime();
        t.tickBySecond();
        t.displayTime();
        t.tickByMinute();
        t.displayTime();
        t.tickByHour();
        t.displayTime();

        HourlyEmployee he = new HourlyEmployee(1000, "John", 100, 8);
        System.out.println(he.getSalary());
        MyTime t2 = new MyTime(12, 59, 58, "AM");
        t2.displayTime();
        t2.tickBySecond();
        t2.displayTime();
        t2.tickByMinute();
        t2.displayTime();
        t2.tickByHour();
        t2.displayTime();
    }
}