
public class Main {

	public static void main(String[] args) {
		Employee e = new Employee(1000, "John", 2500);

		HourlyEmployee he = new HourlyEmployee(2000, "David", 100, 8);
		he.setSalary(4000);
		System.out.println();
		PieceWorkerEmployee pwe = new PieceWorkerEmployee(3000, "Sarah", 101, 2);
		pwe.setSalary(5000);
		System.out.println();

		CommissionEmployee ce = new CommissionEmployee(4000, "Peter", 15000);
		
		BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(5000, "Jody", 2000,
		ce.getTotalSales(), ce.computeSalary());
		System.out.println();
		
		EmployeeRoster data = new EmployeeRoster();
		System.out.println();
		data.addEmployee(bpce);
		data.addEmployee(e);
		data.addEmployee(he);
		data.addEmployee(pwe);
		data.addEmployee(ce);
//		data.addEmployee(new BasePlusCommissionEmployee(2000, "Sarah"));
//		data.addEmployee(new BasePlusCommissionEmployee(3000, "Jody"));
//		data.addEmployee(new BasePlusCommissionEmployee(4000, "Nikki"));
//		data.addEmployee(new BasePlusCommissionEmployee(5000, "Jason"));
//		data.addEmployee(new BasePlusCommissionEmployee(6000, "David"));
//		data.addEmployee(new BasePlusCommissionEmployee(7000, "Peter"));
		data.displayEmployees();
//		System.out.println(String.format("\nCount: %d", data.getCount()));
		EmployeeRoster newData = data.deleteEmployee(2000);
		System.out.println();
		newData.displayEmployees();
		data.displayEmployees();
		System.out.println();
		System.out.println(data.countBasePlusCommissionEmployee());
		System.out.println(data.countPieceWorkerEmployee());
//		System.out.println(data.countCommissionEmployee());
//		System.out.println(data.countHourlyEmployee());
//		System.out.println(String.format("\nCount: %d", data.getCount()));
	}

}
