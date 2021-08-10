package assignment3;

public class EmpState {
	protected static int Id;
	protected static  String lastName;
	public static  String firstName;
	private static String email;
	private static int departmentId;
	protected static double basicSalary;
	
	
	EmpState (){
		this(Id, lastName, firstName, email, departmentId, basicSalary);
	}
	
	EmpState (int Id, String lastName, String firstName, String email, int departmentId, double basicSalary){
		this.Id = Id++; this.lastName = lastName; this.firstName = firstName; this.email = email;
		this.departmentId = departmentId; this.basicSalary = basicSalary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	

	@Override
	public String toString() {
		return "EmpState [Id=" + Id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ ", departmentId=" + departmentId + ", basicSalary=" + basicSalary + "]";
	}

}
