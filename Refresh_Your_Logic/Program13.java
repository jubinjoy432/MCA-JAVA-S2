import java.io.*;
import java.util.*;
class CString
{
    String str;
    public void read()
    {
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
    }
    public void display()
    {
        System.out.println(str);
    }
    public void  add(CString s)
    {
        System.out.println("Addition Result:");
        str=str+s.str;
        display();
    }
    public void concat(CString obj)
    {
        System.out.println("Concatenation Result:");
        str = str + obj.str;
        display();
    }
}
public class Program13
{
    public static void main(String args[])
    {
        CString a=new CString();
        CString b=new CString();
        System.out.println("Enter a string:");
        a.read();
        System.out.println("Enter another string:");
        b.read();
        System.out.println("First String:");
        a.display();
        System.out.println("Second String:");
        b.display();
        a.add(b);
        a.concat(b);
    }
}