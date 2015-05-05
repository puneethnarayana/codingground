

import com.thoro.Employee;
import com.thoro.Executive;
import com.thoro.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Employee e = new Employee();
		e.PaySlip();
		*/
		Manager m = new Manager("Puneeth",56000,12000);
		m.PaySlip();
		System.out.println("mon salaire: " + m.getSalary());
		
		Executive exec = new Executive("NPG",110000,25000);
		exec.PaySlip();
		
		showSalary(m);
		showSalary(exec);
	}

	private static void showSalary(Employee e) {
		// TODO Auto-generated method stub
		if (e instanceof Manager) {
			System.out.println("Manager Salary: "+e.getSalary());
		}
		else if(e instanceof Executive)
			System.out.println("Executive Salary: "+e.getSalary());
		else
			System.out.println("Employee Salary: "+e.getSalary());
		
	}

}
