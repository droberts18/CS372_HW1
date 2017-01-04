public class EmployeeTest {
	public static void main(String[] args){
		//Employee test
		Employee e1 = new Employee("Alex", "Smith", 75000);
		Employee e2 = new Employee("Cindy", "Smith", 95000);
		
		e1.setFname("Alexander");
		e2.setLname("Kelly");
		e1.setSalary(76000);
		
		// Outputting salary
		System.out.println("Before raise: ");
		System.out.printf("%s %s's Salary: $%.2f\n", e1.getFname(), e1.getLname(), e1.getSalary());
		System.out.printf("%s %s's Salary: $%.2f\n", e2.getFname(), e2.getLname(), e2.getSalary());
		
		// Giving a 10% raise
		e1.setSalary(e1.getSalary()*1.1);
		e2.setSalary(e2.getSalary()*1.1);
		
		// Outputting salary with raise
		System.out.println("After 10% raise: ");
		System.out.printf("%s %s's Salary: $%.2f\n", e1.getFname(), e1.getLname(), e1.getSalary());
		System.out.printf("%s %s's Salary: $%.2f", e2.getFname(), e2.getLname(), e2.getSalary());
	}
}

