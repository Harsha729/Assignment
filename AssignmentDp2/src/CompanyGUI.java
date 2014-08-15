
import java.util.Iterator;
import java.util.List;

public class CompanyGUI implements Container {
	Company company = new Company();
	List<Employee> operationList = company.getempList();

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CompanyIterator();
	}

	public class CompanyIterator implements java.util.Iterator<Employee> {

		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (currentIndex >= operationList.size()) {

				return false;
			}
			return true;
		}

		@Override
		public Employee next() {
			// TODO Auto-generated method stub
			return operationList.get(currentIndex++);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			operationList.remove(currentIndex--);
		}

	}

}
