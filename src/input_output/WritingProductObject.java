package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingProductObject {

	public static void main(String[] args) {

		Product product = new Product(111, "Laptop", 70000, "Electronics");
		ObjectOutputStream object = null;
		try {
			FileOutputStream fout = new FileOutputStream("M:/Java Development/files/Product.txt");
			 object = new ObjectOutputStream(fout);
			object.writeObject(product);
			System.out.println("Writing Object");// need to do Serializable interface
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(object != null)
			try {
				object.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
