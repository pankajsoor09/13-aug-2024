package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingProductObject {

	public static void main(String[] args) {
		ObjectInputStream object = null;
		try {
			FileInputStream fin = new FileInputStream("M:/Java Development/files/Product.txt");
			object = new ObjectInputStream(fin);
			Product product= (Product) object.readObject();// down cast 
			// return type is object class super class so it is stored in product reference
			System.out.println("Product Details");
			System.out.println("Product ID : "+product.getId());
			System.out.println("Product Name : "+ product.getName());
			System.out.println("Price : "+product.getPrice());
			System.out.println("Category : "+product.getCategory());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {//checked
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
