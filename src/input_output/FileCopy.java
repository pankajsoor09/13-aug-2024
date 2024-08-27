package input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {

		String sourceFile1 = args[0];
		String destinationFlie1 = args[1];

		File file = new File(sourceFile1);
		if (file.exists()) {
			FileWriter writer = null;
			BufferedReader br = null;
			Scanner sc = null;
			try {
				FileReader reader = new FileReader(file);
				file = new File(destinationFlie1);
				if (file.exists()) {
					System.out.println("Do you want to overrite contents (yes/no) ?");
					sc = new Scanner(System.in);
					String input = sc.next();
					if (input.equalsIgnoreCase("NO")) {
						writer = new FileWriter(file, true);
					} else {
						writer = new FileWriter(file);
					}
				} else {
					writer = new FileWriter(file);
				}

				br = new BufferedReader(reader);
				String data = null;
				while ((data = br.readLine()) != null) {
					writer.write("\n" + data);
				}
				System.out.println("copied source file contents into the destination file");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
					if (writer != null)
						writer.close();
					if (sc != null)
						sc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("Source File does not exist ");
		}
	}

}
