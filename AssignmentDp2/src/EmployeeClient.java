import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeClient {
	public static void main(String[] args) {
		String empName;
		int empId;
		String email;
		float hourlySalary;
		float hoursWorked;
		double benefits;
		String option;
		String cmpName;
		int cntNumber;
		ArrayList<Integer> durationList = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Name\n");
		empName = scanner.next();
		System.out.println("Enter Employee Id\n");
		empId = scanner.nextInt();
		System.out.println("Enter contact Email\n");
		email = scanner.next();
		System.out.println("Enter Hourly Salary\n");
		hourlySalary = scanner.nextFloat();
		System.out.println("Enter Hoursworked\n");
		hoursWorked = scanner.nextFloat();
		System.out.println("Enter benefits\n");
		benefits = scanner.nextDouble();
		System.out
				.println("Enter hours worked for various projects and the\n " +
						"type of algorithm to calculate (One/Two)");
		Employee emp = new Employee(empName, empId, email, hoursWorked,
				hoursWorked, benefits);
		while (scanner.hasNextInt()) {
			emp.addProjectDuration(scanner.nextInt());
		}

		// System.out.println("values are " + empName + empId + email
		// + hourlySalary + hoursWorked + benefits);

		// System.out
		// .println("Enter the type of Algorithm you want to calculate with (one/two): \n");
		// System.out.println("1. Algorithm 1 : \n");
		// System.out.println("2. Algorithm 2 : \n");
		option = scanner.next();
		
		if (option.equals("One")) {
			// sSystem.out.println("Option is :" + option);
			emp.calcSalary(new AlgorithmOne(), emp);
			System.out.println("Salary is :"
					+ emp.calcSalary(new AlgorithmOne(), emp));
		}

		else if(option.equals("Two")) {
			emp.calcSalary(new AlgorithmTwo(), emp);
			System.out.println("Salary is :"
					+ emp.calcSalary(new AlgorithmTwo(), emp));
		}
		
//		System.out.println("Enter the Company Name\n");
//		cmpName = scanner.next();
//		System.out.println("Enter the Contact Number\n");
//		cntNumber = scanner.nextInt();
		Employee emp1 = new Employee("H", 1, "A", 2,
				3, 4);
		Employee emp2 = new Employee("R", 1, "S", 2,
				3, 4);
		Employee emp3 = new Employee("H", 1, "A", 2,
				3, 4);
		
		Company c =new Company();
		c.addEmplyoee(emp1);
		c.addEmplyoee(emp2);
		c.addEmplyoee(emp3);
		CompanyGUI cgui = new CompanyGUI();
		System.out.println("Displaying Employees:");
		Iterator iterator = cgui.getIterator();
		while(iterator.hasNext()){
			String temp = (String)iterator.next();
			System.out.println("Employee" +temp);
		}
		
		
		
	}
}
