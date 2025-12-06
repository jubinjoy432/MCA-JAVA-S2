import java.io.*;
import java.util.*;
class A 
{
    int a;
    A()
    {
        a=0;
    }
    A(int n)
    {
        a=n;
    }
    public void read()
    {
        System.out.println("Enter value of a(integer):");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
    }
    public void display()
    {
         System.out.println("a="+a);
    }
}
class B extends A
{
    String b;
    B()
    {
        b="";
    }
    B(String n,int a)
    {
        super(a);
        b=n;
    }
    public void read()
    {
        super.read();
        System.out.println("Enter value of a(integer):");
        Scanner s=new Scanner(System.in);
        b=s.nextLine();
    }
    public void display()
    {
        super.display();
        System.out.println("b="+b);
    }
}
class C extends B
{
    float c;
    C()
    {
        c=0;
    }
    C(float n,String b,int a)
    {
        super(b,a);
        c=n;
    }
    public void read()
    {
        super.read();
        System.out.println("Enter value of a(integer):");
        Scanner s=new Scanner(System.in);
        c=s.nextFloat();
    }
    public void display()
    {
        super.display();
        System.out.println("c="+c);
    }
}
public class Inheritance1
{
    public static void main(String args[])
    {
        int ch;
        do{
            System.out.println("\nCreate object of class \n1.A\n2.B\n3.C\n4.Exit");
            System.out.print("Enter your choice:");
            Scanner s=new Scanner(System.in);
            ch=s.nextInt();
            switch(ch)
            {
                case 1:A obja=new A(1);
                        obja.display();
                        break;
                case 2:B objb=new B("Jubin",1);
                        objb.display();
                        break;
                case 3:C objc=new C(3,"Jubin",1);
                        objc.display();
                        break;
                case 4: System.out.println("Exiting!!");break;
                default: System.out.println("Invalid Input");
            }
        }while(ch!=4);
    }
}