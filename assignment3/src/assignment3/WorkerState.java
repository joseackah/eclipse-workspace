package assignment3;

public class WorkerState extends EmpState {
	int hoursWorked;
	double hourlyRate;
	
	WorkerState(int hoursWorked, double hourlyRate, String lastName, String firstName, String email, int departmentId, double basicSalary ){
		
		super(Id, lastName, firstName, email, departmentId, basicSalary);
		
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		
	}
	
	
	public double netSalary() {
		return basicSalary + (hoursWorked * hourlyRate);
	}

	@Override
	public String toString() {
		return "WorkerState [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + ", lastName=" + lastName
				+ ", firstName=" + firstName + ", basicSalary=" + basicSalary + ", netSalary()=" + netSalary()
				+ ", getId()=" + getId() + ", getLastName()=" + getLastName() + ", getFirstName()=" + getFirstName()
				+ ", getEmail()=" + getEmail() + ", getDepartmentId()=" + getDepartmentId() + ", getBasicSalary()="
				+ getBasicSalary() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	public double hourlyRate() {
		return hourlyRate;
	}

}
