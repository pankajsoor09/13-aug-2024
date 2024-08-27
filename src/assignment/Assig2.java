package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assig2 {

	public static void main(String[] args) {

		String str = (args[0]);
		str = str.replace("_", " ");// it will replace all "_" with "space"/" "
		// String str = "Hello its my assignment ";
		FileOutputStream fout = null;

		File file = new File("M:/Java Development/files/io.txt");

		// writing msg in io.txt
		try {
			fout = new FileOutputStream("M:/Java Development/files/io.txt");
			fout.write(str.getBytes());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fout != null)
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

//-----------------------------------------------------------------------------
		// reading msg from io.txt
		if (file.exists()) {
			FileInputStream fin = null;
			System.out.println(" Content of io.txt  ");
			try {
				fin = new FileInputStream(file);
				int i = 0;
				while ((i = fin.read()) != -1) {
					System.out.print((char) i);// typecasting
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
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
			System.out.println("\nThe size of io.txt : " + file.getTotalSpace());
			System.out.println("The length of io.txt : " + file.length());

		} else {
			System.out.println("File Does Not Exixts");
		}
		// file.delete();
		// System.out.println("is the io.txt file deleted "+file.delete());
		if (file.delete() == true) {// delete the file
			System.out.println("The file io.txt has be deleted");
		}
		System.out.println("End of Application");
	}

}
