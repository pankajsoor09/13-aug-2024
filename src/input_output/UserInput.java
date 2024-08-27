package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			reader = new BufferedReader(in);
			System.out.println("Enter Name : ");
			String name = reader.readLine();// one line of data at a time
			System.out.println("User Entered Name : " + name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
