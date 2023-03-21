import java.util.ArrayList;

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
		System.out.print(data.addEmployee(e));
		System.out.print(data.addEmployee(he));
		System.out.print(data.addEmployee(pwe));
		System.out.print(data.addEmployee(ce));
		System.out.print(data.addEmployee((Employee)bpce));
		data.displayEmployees();
//		System.out.println(String.format("\nCount: %d", data.getCount()));
		ArrayList<Employee> newData = data.deleteEmployee(2000);
		System.out.println();
		System.out.println("\nID:	NAME:	SALARY:		TYPE:	");
		for(Employee emp : newData) {

			System.out.print(String.format("\n%d	%s	%,.2f	", emp.getEmpID(), emp.getEmpName(), emp.getSalary()));
			
			if (emp instanceof HourlyEmployee)
				System.out.print("Hourly ");
			if (emp instanceof CommissionEmployee)
				System.out.print("Commission ");
			if (emp instanceof PieceWorkerEmployee)
				System.out.print("Piece Worker ");
			if (emp instanceof Employee)
				System.out.print("Employee");
		}
		data.displayEmployees();
		System.out.println();
		System.out.println(data.countBasePlusCommissionEmployee());
		System.out.println(data.countPieceWorkerEmployee());
//		System.out.println(data.countCommissionEmployee());
//		System.out.println(data.countHourlyEmployee());
//		System.out.println(String.format("\nCount: %d", data.getCount()));
	}

}
