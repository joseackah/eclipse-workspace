package sample;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] names = {
				{"Mr.", "Mrs.", "Ms."}, 
				{"Smith", "Jones"}
			};
		
		//System.out.println(names[0][0] + names[1][0]);
		//System.out.println(names[0][2] + names[1][1]);
		
		
		char[] copy = {'K', 'i', 'g', 'o', 's', 't'};
		
		//char[] to = new char[5];
		
		//System.arraycopy(copy, 1, to, 0,5);
		
		char[] to = java.util.Arrays.copyOfRange(copy, 0, 5);
 		
		System.out.println( names[0][1] + names[1][1] + "" + new String(to));
		
		
		
		
		
		
		
		
		
	}

}
