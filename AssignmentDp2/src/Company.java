import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


    public class Company {
	
	String companyName;
	int contactPhone;
	List<Employee> employees = new ArrayList<Employee>();
	
	public void addEmplyoee(Employee e){
		
		employees.add(e);
	Iterator<Employee> iterator = employees.iterator();
    System.out.println("Employess are :" + iterator);
		
	}

	public List getempList(){
		return employees;
	}
    
    }
