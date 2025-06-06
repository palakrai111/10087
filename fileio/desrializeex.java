package in.sp.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class desrializeex {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		FileInputStream  fis = new FileInputStream("D:\\testout118.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Emp123 e = (Emp123)ois.readObject();
		System.out.println(e.id + " "+e.name);

	}

}
