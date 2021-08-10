package assignment3;

public abstract class Detail {
	int id;
	
	
	String manager(int id, double perf) {
		return "id: " + id + "; performance bonus: " + perf;
		
	}
	
	String worker(int id, double hours) {
		return "id: " + id + "; hourly rate: " + hours;
		
	}

}
