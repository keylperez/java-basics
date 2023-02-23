package randoms;

public class Main {

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
