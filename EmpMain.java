package in.sp.backend;
import java.util.*;
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[3];
		for(int i = 0; i <3;i++)
		{
			e[i] = new Employee();
			System.out.println("eneter id");
			int eid = sc.nextInt();
			System.out.println("eneter name");
			String ename = sc.next();
			e[i].setEid(eid);
			e[i].setEname(ename);
		}

		for(Employee x:e)
		{
			System.out.println(x);
		}
	}

}
