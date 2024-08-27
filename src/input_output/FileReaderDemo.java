package input_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileReader reader = new FileReader("M:\\Java Development\\files\\empData.txt");
			/*
			 * int ch = 0; 
			 * while ((ch = reader.read()) != -1) { 
			 * System.out.println((char)ch); 
			 * }
			 */
			br = new BufferedReader(reader);
			String str = null;
			while((str =br.readLine())!= null) {//to print all in the file
				System.out.println(str);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
