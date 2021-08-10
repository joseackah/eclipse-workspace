package interfaces;

public class InterMain {

	public static void main(String[] args) {
		
		TimeClient myTimeClient = new SimpleTimeClient();
		
		System.out.println("Current time: " + myTimeClient.toString());
		System.out.println("Time in Ghana: " + myTimeClient.getZonedDateTime("Blah blah").toString());
	}

}
