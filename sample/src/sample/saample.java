package sample;
import java.io.FileInputStream;
import java.io.IOException;

public class saample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		//FileInputStream
		try {
		FileInputStream input = new FileInputStream("some1.txt");
		
		//for(int i =input.read(); i != -1; i = input.read()) {
		/*int i = input.read();
		while (i !=-1) {
		
			System.out.write(i);
			i = input.read();
		
	}*/
		//byte[] data = new byte[input.available()];
		byte [] data = input.readAllBytes();
		input.read(data);
		
		for(int i =0; i < data.length; i++) {
			System.out.write(data[i]);
		}
		//System.out.flush();
	
		}catch(IOException io) {
			System.out.println(io + "this is not right.");
		}
		
		
		
		System.out.println();
		
		
	}

}
