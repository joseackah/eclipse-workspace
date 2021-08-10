package assignment3;

public class Worker extends Employee{

	private int hoursWorked;
	private int hourlyRate;
	
	public Worker(String name, String email, int departmentId, double basic, int hoursWorked, int hourlyRate) {
		super(name, email, departmentId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return super.toString() + " hoursWorked: " + hoursWorked + ",  hourlyRate: " + hourlyRate + ".";
	}
	
	public double getHourlyRate () {
		return hourlyRate;
	}
	
	public double computeNetSalary() {
		return super.getBasic() + (hoursWorked * hourlyRate);
	}
	
	
	
	
	
	
	
	
}
