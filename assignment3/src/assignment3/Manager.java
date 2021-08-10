package assignment3;

public class Manager extends Employee {
	
	private String department;
	private double perfBonus;
	
	Manager(String name, String email, int departmentId, double basic, String department, double perfBonus){
		
		super(name, email, departmentId, basic);
		this.department = department;
		this.perfBonus = perfBonus;
	}

	@Override
	public String toString() {
		return super.toString() +" department: "+ department  +" performance bonus: " + perfBonus + ".";
	}
	
	
	public double computeSalary() {
		return super.getBasic() + perfBonus;
		
		
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}

}
