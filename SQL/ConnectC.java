import java.sql.*;
import java.util.*;

public class ConnectC
{
    public static void main(String[] args) {
        try {
            String no,na,sal,sql;
            Scanner s=new Scanner(System.in);
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
            System.out.println("connected.."+con);
		Statement st = con.createStatement();
        CallableStatement pst=con.prepareCall("{call insert_emp(?,?,?)}");
        System.out.println("Enter eno,ename,esal:");
        no=s.nextLine();
        na=s.nextLine();
        sal=s.nextLine();
        pst.setInt(1,Integer.parseInt(no));
        pst.setString(2,na);
        pst.setFloat(3,Float.parseFloat(sal));
        pst.execute();
       ResultSet rs = st.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getString(1) + "  " + rs.getString(2)+"  " + rs.getString(3));
		}
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
}
}