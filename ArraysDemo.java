package in.sp.backend;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,44,5};
		int sum =0;
		for(int i = 0; i < a.length; i++)
		{
			 sum = sum + a[i];
		}
        System.out.println(sum);
        
        int max = a[0];
        
        for(int i = 0; i < a.length; i++)
		{
			 if(a[i] > max)
			 {
				 max = a[i];
			 }
		}
        System.out.println(max);
        
        int count = 0;
        int score =0;
        
        for(int i = 0; i < a.length; i++)
        {
        	if(a[i]<35)
        	{
        		count++;
        		
        	}
        	score = score + a[i];
        }
        System.out.println("failed in " + count + "subjects");
        
        System.out.println(score);
	}

}
//creation
//declaration
//using user input
//min and max
// pass fail
// search element
//for each loop
//digonal sum