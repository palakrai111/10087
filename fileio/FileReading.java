package in.sp.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fin=new FileInputStream("D:\\testout102.txt");
		int i = 0;
		while((i=fin.read())!= -1)
		{
			System.out.print((char)i);
		}
		
		//fin.close();

	}

}
