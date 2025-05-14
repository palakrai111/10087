package in.sp.backend;

public class Stringsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String x = "nayan";
       System.out.println("length"+x.length());
       System.out.println("chat presnt at index 0"+x.charAt(0));
       System.out.println("to char array");
       char c[] = x.toCharArray();
       for(char y : c)
       {
    	   System.out.println(y);
       }
       System.out.println("Split demo");
       String s1 = "i am palak rai";
       String sa[] = s1.split(" ");
       for(String z: sa)
       {
    	   System.out.println(z);
       }
       System.out.println("reversing");
       
       String rev = "";
       
       for(int i = x.length()-1; i>=0;i--)
       {
    	   rev = rev + x.charAt(i);
       }
       System.out.println("rev is : "+ rev);
       
       if(x.equals(rev))
       {
    	 System.out.println("palindrome");  
       }
       else
       {
    	   System.out.println("not palindrome");
       }
       
       String z = "palakrai";
       //z = z.replace('a', 't');
       z = z.replaceFirst("a","*");
      
       System.out.println("updated value is :  "+z);
       
       
	}

}
