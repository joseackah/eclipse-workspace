package assignment3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prices pr;
		
		System.out.println(prices.SHORT.getPrice());
		
		for(prices ep: prices.values()) {
			System.out.println(ep + " " + " " + ep.getPrice());
		}
	}

}
