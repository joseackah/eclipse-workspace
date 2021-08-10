package assignment3;

public class Employee extends Detail {
	
	
	private static int counter;
	private int id;
	private String name;
	private String email;
	private int departmentId;
	private double basic;
	
	static {
		counter = 100;
		
	
		
	}
	
	public Employee (String name, String email, int departmentId, double basic) {
		
		this.id = ++counter;
		this.name = name; this.email = email; this.departmentId = departmentId;
		this.basic = basic;
	}
	
	public double getBasic() {
		return basic;
	}
	
	public double getUpDateSalary(double update) {
		return basic += update;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", departmentId=" + departmentId
				+ ", basic=" + basic + "]";
	}
	
	/*public String manager(int id, double perf) {
		
		return manager;	
	}*/
	
	String worker(int id, double hours) {
		return "id: " + id + "; hourly rate: " + hours;
		
	}
}
