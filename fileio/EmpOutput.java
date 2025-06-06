package in.sp.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Emp123  ob = new Emp123 (101,"abc");
		FileOutputStream  fos = new FileOutputStream("D:\\testout118.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);
		System.out.println("done");
		fos.close();

	}

}
