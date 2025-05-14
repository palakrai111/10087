package in.sp.backend;
import java.util.*;
public class Thirdp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		do
		{
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter your choice press y to continue n");
			choice = sc.next().charAt(0);
			
		}while(choice != 'n');
		
		
		
		

	}

}
