package in.sp.backend;

public class StringBufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(1, "java");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
