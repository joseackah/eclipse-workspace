package assignment3;

public enum prices {
	
	TSHIT(45), TROUSERS(100), SHORT(45);
	
	private int price;

	prices(int i) {
		
		 price = i;
	} 
	
	 public int getPrice(){
		return price;
	}

}
