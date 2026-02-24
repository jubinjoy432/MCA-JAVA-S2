import java.io.*;
class Ser
{
    public static void main(String args[])
    {
        try{
        Student s1=new Student(1, "rahul");
        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
         System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}