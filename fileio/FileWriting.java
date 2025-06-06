package in.sp.fileio;
import java.io.*;
public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream  fos = new FileOutputStream("D:\\testout102.txt");
            String s = "i am palak";
            byte b[] = s.getBytes();
            fos.write(b);
            System.out.println("data sent successfull");
            fos.close();
		
	}

}
