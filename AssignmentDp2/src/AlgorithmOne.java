public class AlgorithmOne implements SalaryComputer {

	double salary;

	@Override
	public double computeSalary(Employee employee) {
		// TODO Auto-generated method stub
		salary = employee.hourlySalary
				* (employee.hoursWorked + employee.benefits);

		return salary;
	}

}
