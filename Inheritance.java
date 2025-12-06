import java.io.*;
import java.util.*;
class Author
{
    String aname;
    int ano;
    Author()
    {
        aname="Sample";
        ano=0;
    }
    Author(String name,int no)
    {
        aname=name;
        ano=no;
    }
    public void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter author name:");
        aname=s.nextLine();
        System.out.println("Enter author number:");
        ano=s.nextInt();
    }
    public void display()
    {
        System.out.println("Author Name: "+aname);
        System.out.println("Author Number: "+ano);
    }
}
class Book extends Author
{
    String bname;
    float bprice;
    Book()
    {
        bname="Sample";
        bprice=0;
    }
    Book(String name,float price,String aname,int ano)
    {
        
        super(aname,ano);
        bname=name;
        bprice=price;
    }
    public void read()
    {
        super.read();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter book name:");
        bname=s.nextLine();
        System.out.println("Enter book price:");
        bprice=s.nextFloat();
    }
    public void display()
    {
        super.display();
        System.out.println("Book Name: "+bname);
        System.out.println("Book Price: Rs."+bprice);
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        Book obj1=new Book();
        obj1.display();
        Book obj=new Book("Harry Potter",299,"JK Rowling",01);
        obj.display();
    }
}
