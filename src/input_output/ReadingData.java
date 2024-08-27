package input_output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingData {

	public static void main(String[] args) {
		DataInputStream data = null;
		try {
			FileInputStream fin = new FileInputStream("M:/Java Development/files/emp.txt");
			//DataInputStream data = new DataInputStream(fin);
			data = new DataInputStream(fin);
			System.out.println("ID : "+data.readInt());
			System.out.println("Salary : "+data.readFloat());
			System.out.println("ID : "+data.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(data != null)
				try {
					data.close();//if datainputSteam is closed then the related file will also be close a
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
