package classes;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpID(1000);
		e.setEmpName("John");

        HourlyEmployee he = new HourlyEmployee(e.getEmpID(), e.getEmpName(), 100, 8);
        he.displayInfo();
//        System.out.println(he.toString());
//        System.out.println("HourlyEmployee salary: " + he.getSalary());
        
        PieceWorkerEmployee pwe = new PieceWorkerEmployee(e.getEmpID(), e.getEmpName(), 101, 2);
        System.out.println();
        pwe.displayInfo();
//        System.out.println(pwe.toString());
//        System.out.println("PieceWorkerEmployee total price: " + pwe.totalPrice());        
//        System.out.println("PieceWorkerEmployee bonus: " + pwe.getBonus());
        
        CommissionEmployee ce = new CommissionEmployee(e.getEmpID(), e.getEmpName(), 10000);
//        System.out.println("CommissionEmployee commission: " + ce.getCommission());
        
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(e.getEmpID(), e.getEmpName(), pwe.totalPrice(), ce.getTotalSales());
        System.out.println();
        bpce.displayInfo();
//        System.out.println(bpce.toString());
//        System.out.println("Base Salary: " + bpce.getBaseSalary());
//        System.out.println("BasePlusCommissionEmployee total salary: " + bpce.getTotalSalary(ce.getCommission()));
	}

}
