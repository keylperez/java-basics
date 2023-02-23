package classes;

public class Main {

	public static void main(String[] args) {
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
        

        HourlyEmployee he = new HourlyEmployee(1000, "John", 100, 8);
        System.out.println("HourlyEmployee salary: " + he.getSalary());
        
        PieceWorkerEmployee pwe = new PieceWorkerEmployee(101, 2);
        System.out.println("PieceWorkerEmployee total price: " + pwe.totalPrice());        
        System.out.println("PieceWorkerEmployee bonus: " + pwe.getBonus());
        
        CommissionEmployee ce = new CommissionEmployee(10000);
        System.out.println("CommissionEmployee commission: " + ce.getCommission());
        
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(ce.getCommission(), pwe.totalPrice());
        System.out.println("BasePlusCommissionEmployee total salary: " + bpce.getTotalSalary());
	}

}
