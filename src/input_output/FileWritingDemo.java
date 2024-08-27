package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo {

	public static void main(String[] args) {

		String msg = "Hello there";//welcome To java IO
		FileOutputStream fout = null;
		try {
			// constructor of FileoutoutStream class declares (Throws) checked exception i.e FileNotFoundException
			fout = new FileOutputStream("M:\\Java Development\\files\\message.txt",true);//boolean true to  append or add string
			// getBytes() of string class converts String into byte[] array
			fout.write(msg.getBytes());// write () declares (Throws )checked exception i.e IOException
			System.out.println("Write msg into files");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fout != null)
				try {
					fout.close();// close() declares (throws) checked exception i.e IOException
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
