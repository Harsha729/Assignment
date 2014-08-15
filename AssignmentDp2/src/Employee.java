import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee {

	String name;
	int employeeID;
	String email;
	float hourlySalary;
	float hoursWorked;
	double benefits;
	int longestDuration;

	ArrayList<Integer> projectduration = new ArrayList<Integer>();

	private SalaryComputer salarycomputer;

	public Employee(String name, int employeeID, String email,
			float hourlySalary, float hoursWorked, double benefits) {

		this.name = name;
		this.employeeID = employeeID;
		this.email = email;
		this.hourlySalary = hourlySalary;
		this.hoursWorked = hoursWorked;
		this.benefits = benefits;

	}

	void addProjectDuration(int duration) {
		projectduration.add(duration);

		Iterator<Integer> iterator = projectduration.iterator();
		while (iterator.hasNext()) {
			System.out.println("List Values are :" + iterator.next());

		}
		maxElement(projectduration);
	}

	void maxElement(ArrayList alist) {

		longestDuration = (Integer) Collections.max(alist);
		System.out.println("max Values are :" + longestDuration);

	}

	double calcSalary(SalaryComputer salarycomputer, Employee Employee) {
		this.salarycomputer = salarycomputer;
		return salarycomputer.computeSalary(Employee);
	}
}
