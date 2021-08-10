package customer;

public class Customer {
	
	private String name;
	private String email;
	private int age;
	private double creditLimit;

	
	public Customer(){
		
		this("Rama", "rama@gmail.com", 25, 10_000);
	}
	
	public Customer(String name, String email, int age, double creditLimit) {
		this.creditLimit= 15_000;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public String getEmail(String email) {
		return email;
	}
	
	public int getAge(int age) {
		return age; 
	}
	
	
	public  String getDetail(String name, String email) {
		return "name: " + name + "  Credit limit: " + creditLimit + "  Email: " + email;
	}
	
	
	
	
	
	
	
	
	
	
}
