package in.sp.backend;

public interface Showable 
{
   public void print();
   void show();  // by defaul methods are public and abstract
   
   static void add()
   {
	   System.out.println("i am adding");
   }
}
