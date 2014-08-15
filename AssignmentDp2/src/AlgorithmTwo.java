public class AlgorithmTwo implements SalaryComputer {

	double salary;

	@Override
	public double computeSalary(Employee employee) {
		// System.out.println("Values are" + employee.hourlySalary + employee.hoursWorked + employee.longestDuration);
		// TODO Auto-generated method stub
		salary = employee.hourlySalary
				* (employee.hoursWorked + (50 * employee.longestDuration));
		return salary;
	}

}
