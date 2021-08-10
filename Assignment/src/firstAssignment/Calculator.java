package firstAssignment;

public class Calculator {
	private double number1;
	private double number2;
	
	
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	public double getNumber1(double number1) {
		return number1;
	}
	
	public double getNumber2(double number2) {
		return number2;
	}
	
	public double add() {
		return number1 + number2;
	}
	
	public double multiply() {
		return number1 * number2;
	}
	
	public double division() {
		try {
		if(number1==0 || number2 == 0) {
			return 0;
		}
		else {
			return number1 / number2;
		}
		}catch(Exception e)	{
			System.out.println(e + " : " + "any of the numbers should not be zero");
		}
		return 0;
		
	}
	
	public double subtract () {
		return number1 - number2;
	}
	
	
	
	
}
