package randoms;

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
	}
}
