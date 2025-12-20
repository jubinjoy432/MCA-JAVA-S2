import java.util.*;
interface ishape{
    public void draw();
    public void mov();
}

class Circle implements ishape{
    public void draw()
    {
        System.out.println("Drawing Circle");
    }
    public void mov()
    {
        System.out.println("Moving Circle");
    }
}
class Rectangle implements ishape{
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
    public void mov()
    {
        System.out.println("Moving Rectangle");
    }
}
class Program20{
    public static void main(String args[])
    {
            ishape obj;
            int ch;
            Scanner s=new Scanner(System.in);
            System.out.println("Choose a Shape:\n1.Circle \n2.Rectangle");
            ch=s.nextInt();
            if(ch==1)
            {
                obj=new Circle();
            }
            else if(ch==2)
            {
                obj=new Rectangle();
            }
            else
            {
                System.out.println("Invalid Input");
                return;
            }
            obj.draw();
            obj.mov();
    }
}