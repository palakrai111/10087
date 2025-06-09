package in.sp.dbnew;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studb {
	dbcon2 ob;
	Studb(dbcon2 ob)
	{
		this.ob = ob;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con =dbcon2.getCon();
		
		/*String s = "insert into user1 values("n","mm","ll")";
		/*String s = "delete from user1 where name = ?";
		PreparedStatement ps = con.prepareStatement(s);
		ps.setString(1, "palak");
		/*ps.setString(2, "abc");
		ps.setString(3, "paak@");
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("deletion done");
		}
		else
		{
			System.out.println("not done");
		}
		
    con.close(); */
		
		String s = "select * from user1";
		PreparedStatement ps = con.prepareStatement(s);
		Statement s22 = con.createStatement();
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			String name = rs.getString(1);
			String password = rs.getString(2);
			String email = rs.getString(3);
			System.out.println(name +" "+password+ " " + email);
		}
		
		
		
		
	}

}
