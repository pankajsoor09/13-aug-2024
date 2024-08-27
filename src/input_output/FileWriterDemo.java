package input_output;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		String msg = "welcome To java world";
		FileWriter writer = null;
		try {
			 writer = new FileWriter("M:\\Java Development\\files\\msg.txt",true);//will create msg file
			// true will append the msg means add 
			 writer.write(msg);
			System.out.println("writing message into files");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer != null)
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
