import java.io.*;

public class Student implements Serializable
{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void disp()
    {
        System.out.println("id:"+id+", name:"+name);
    }
}