package input_output;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		File file = new File("M:\\Java Development\\files\\demo.txt");// path name
		if (file.exists()) {
			FileInputStream fin = null;
			try {
				// FileInputStream fin = new FileInputStream(file);
				fin = new FileInputStream(file);
				// int i = fin.read();// read is declared in throws
				int i = 0;
				while ((i = fin.read()) != -1) {
					System.out.print((char) i);// typecasting
				}
			} catch (FileNotFoundException e) {// sub class exception
				e.printStackTrace();// prints the details about exception in red color
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fin != null)
				try {
						fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("File Does Not Exixts");
		}
		System.out.println("End of Application");
	}

}
