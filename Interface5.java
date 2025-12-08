import java.io.*;
import java.util.*;
interface shape{
    public void read();
    public void disp();
    public void area();
}
class Circle implements shape{
    float ar,r;
     public void read(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the radius:");
        r=s.nextInt();
     }
      public void disp()
      {
         System.out.println("Area of circle:"+ar);
      }
      public void area()
      {
        ar=(float)3.14*r*r;
      }
}
class Rectangle implements shape{
    float ar,l,b;
     public void read(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length:");
        l=s.nextInt();
        System.out.print("Enter the breadth:");
        b=s.nextInt();
     }
      public void disp()
      {
         System.out.println("Area of Rectangle:"+ar);
      }
      public void area()
      {
        ar=(float)l*b;
      }
}
class Triangle implements shape{
    float ar,b,h;
     public void read(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the base:");
        b=s.nextInt();
        System.out.print("Enter the height:");
        h=s.nextInt();
     }
      public void disp()
      {
         System.out.println("Area of Triangle:"+ar);
      }
      public void area()
      {
        ar=(float)0.5*b*h;
      }
}
class Interface5
{
    public static void main(String args[])
    {
        int ch;
        shape obj;
        Scanner s=new Scanner(System.in);
        do{
             System.out.print("1.Circle\n2.Reactangle\n3.Triangle\n4.Exit\nEnter your choice:");
             ch=s.nextInt();
             switch(ch){
                case 1:obj=new Circle();
                        obj.read();
                        obj.area();
                        obj.disp();
                        break;
                case 2:obj=new Rectangle();
                        obj.read();
                        obj.area();
                        obj.disp();
                        break;
                case 3:obj=new Triangle();
                        obj.read();
                        obj.area();
                        obj.disp();
                        break;
                case 4: System.out.println("Exiting!!");break;
                default: System.out.println("Invalid Input");
             }  
        }while(ch!=4);
    }
}