package in.sp.backend;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {12,13,35,80,90};
	
		int failcount = 0;
		int score = 0;
		for(int i = 0 ; i < marks.length;i++)
		{
			if(marks[i] <= 35)
			{
				 failcount++;
			}
			score = score + marks[i];
		}

		System.out.println("student is fail in "+failcount+"subjects" );
		System.out.println("score :" + score);
	}

}
