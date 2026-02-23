import java.sql.*;
import java.util.*;
public class practice {
    public static void main(String args[])
    {
        try
        {
            String no,na,sal,sql;
            Scanner s=new Scanner(System.in);
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jubin","2002");
            System.out.println("connected.."+con);
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
            System.out.println("Enter eno,ename,esal:");
            no=s.nextLine();
            na=s.nextLine();
            sal=s.nextLine();
            pst.setInt(1,Integer.parseInt(no));
            pst.setString(2,na);
            pst.setFloat(3,Float.parseFloat(sal));
            pst.execute();
            sql="select * from emp";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                 System.out.println(rs.getString(1) + "  " + rs.getString(2)+"  " + rs.getString(3));
            }

        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}
