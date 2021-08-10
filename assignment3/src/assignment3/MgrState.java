package assignment3;

public class MgrState extends EmpState {
	
	protected double perfBonus;
	
	MgrState(String hoursWorked, double hourlyRate, String lastName, String firstName, String email, int departmentId, double basicSalary, double perfBonus){
		
		super(Id, lastName, firstName, email, departmentId, basicSalary);
		
		this.perfBonus = perfBonus;
	}
	
	
	public double computeNetSalary() {
		return basicSalary + perfBonus;
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}


	@Override
	public String toString() {
		return "MgrState [perfBonus=" + perfBonus + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", basicSalary=" + basicSalary + ", computeNetSalary()=" + computeNetSalary() + ", getPerfBonus()="
				+ getPerfBonus() + "]";
	}
	
	

}
