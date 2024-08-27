package input_output;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingData {
	
	public static void main(String[] args) {
		int id = 111;
		String name = "Raj";
		float salary = 2500000.00f;
		DataOutputStream data = null ;//if dataoutputstream is used to write then datainputstream method must be used to read
		try {
			FileOutputStream fout = new FileOutputStream("M:/Java Development/files/emp.txt");//it will create file if not there.
			//DataOutputStream data = new DataOutputStream(fout);
			data = new DataOutputStream(fout);//
			//fout.write(id);
			data.writeInt(id);
			data.writeFloat(salary);
			data.writeUTF(name);//UTF is used Writing string
			System.out.println("Writing data into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(data != null)
				try {
					data.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("End of application");
	}

}
