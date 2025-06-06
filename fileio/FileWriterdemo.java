package in.sp.fileio;
import java.io.*;
public class FileWriterdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("D:\\testout103.txt");
		
		fw.write("hello, Sai Ram");
		fw.close();
		System.out.println("done");

	}

}
