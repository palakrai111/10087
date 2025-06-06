package in.sp.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferREderexample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter id");
		int id = Integer.parseInt(br.readLine());
		System.out.println(id);
		System.out.println("enter name");
		String name = br.readLine();
		System.out.println(name);
		
		
		

	}

}
