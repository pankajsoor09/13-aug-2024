package input_output;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WritingEmployeeDetails {

	public static void main(String[] args) {
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			reader = new BufferedReader(in);
			System.out.println("Enter Employee Details : ");
			System.out.println("Enter ID : ");
			int id = Integer.parseInt(reader.readLine());
			System.out.println("Enter Name : ");
			String name = reader.readLine();
			System.out.println("Enter Salary");
			float salary = Float.parseFloat(reader.readLine());

			System.out.println("Writing Employee Details into file");

			writer = new FileWriter("M:\\Java Development\\files\\empData.txt", true);
			writer.write("\nID : " + id);
			writer.write("\nName : " + name);
			writer.write("\nSalary : " + salary);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
