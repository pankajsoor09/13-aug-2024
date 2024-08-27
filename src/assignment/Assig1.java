package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assig1 {

	public static void main(String[] args) {
		String source = args[0];
		source = source.replace("_", " ");
		String destination = args[1];
		destination = destination.replace("_", " ");//it will replace all "_" with "space"/" "
		FileOutputStream srcOut = null;
		FileOutputStream destiOut = null;

		// Writing in source file

		try {
			srcOut = new FileOutputStream("M:/Java Development/files/Sourcefile.txt");
			srcOut.write(source.getBytes()); // string to bytes
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (srcOut != null)
				try {
					srcOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
//------------------------------------------------------------------------------------------------------------------------
		// Reading from source file

		File file1 = new File("M:/Java Development/files/Sourcefile.txt");
		FileInputStream srcIn = null;
		if (file1.exists()) {
			System.out.println("The source file has been created. ");
			try {
				srcIn = new FileInputStream(file1);
				int i = 0;
				System.out.print("Content of source file: ");
				while ((i = srcIn.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (srcIn != null)
					try {
						srcIn.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		} else {
			System.out.print("Source file was not created. ");
		}

		System.out.print("\n-----------------------------------------\n");
//------------------------------------------------------------------------------------------------------------------------
		// Writing in destination file

		try {
			destiOut = new FileOutputStream("M:/Java Development/files/Destinationfile.txt");
			destiOut.write(destination.getBytes()); // string to bytes
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (destiOut != null)
				try {
					destiOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
//------------------------------------------------------------------------------------------------------------------------
		// Reading from destination file

		File file2 = new File("M:/Java Development/files/Destinationfile.txt");
		FileInputStream destiIn = null;
		if (file2.exists()) {
			try {
				destiIn = new FileInputStream(file2);
				int i = 0;
				System.out.print("Content of destination file: ");
				while ((i = destiIn.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (destiIn != null)
					try {
						destiIn.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}

			// user input for permission to overwrite

			System.out.print("\nThe destination file has been created. Do you want to overwrite it (yes/no)? \n");
			String userIn = args[2].toLowerCase();
			if (userIn.equals("yes")) {
				file2 = file1;
			} else if (userIn.equals("no")) {
				System.out.print("You have chosen not to overwrite the destination file. ");
			}
		} else {
			System.out.print("Destination file was not created. ");
		}
//------------------------------------------------------------------------------------------------------------------------
		// Reading the destination file after overwrite

		try {
			destiIn = new FileInputStream(file2);
			System.out.print("Content of destination file after overwriting: ");
			int i = 0;
			while ((i = destiIn.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (destiIn != null)
				try {
					destiIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
