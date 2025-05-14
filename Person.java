package in.sp.backend;
import java.util.*;
public class Person 
{
     int id ;
     String name;
     Scanner sc = new Scanner(System.in);
     
     
     
     void setId(int i)
     {
    	 id  = i;
     }
     int getId()
     {
    	 return id;
     }
     void acceptInfo()
     {
    	 System.out.println("enter name");
    	 name = sc.next();
    	 System.out.println("enter id");
    	 id = sc.nextInt();
    	 
     }
     void displayInfo()
     {
    	 System.out.println("name is : "+name );
    	 System.out.println("id is : "+id );
     }
}
