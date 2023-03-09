
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1000, "John");

		HourlyEmployee he = new HourlyEmployee(e.getEmpID(), e.getEmpName(), 100, 8);
		System.out.println();
		he.displayInfo();
		PieceWorkerEmployee pwe = new PieceWorkerEmployee(e.getEmpID(), e.getEmpName(), 101, 2);
		System.out.println();
		pwe.displayInfo();

		CommissionEmployee ce = new CommissionEmployee(e.getEmpID(), e.getEmpName(), 10000);
		BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(e.getEmpID(), e.getEmpName(), 200,
		ce.getTotalSales(), ce.getCommission());
		System.out.println();
		bpce.displayInfo();

	}

}
