import java.util.Scanner;

class AddMult{
    int a[][],b[][],c[][];
    int r1,c1,r2,c2;
    public void read()
    {

            Scanner s=new Scanner(System.in);
            System.out.println("Enter the order of the first matrix:");
            r1=s.nextInt();
            c1=s.nextInt();
            a=new int[r1][c1];
            System.out.println("Enter the order of the second matrix:");
            r2=s.nextInt();
            c2=s.nextInt();
            b=new int[r2][c2];
            System.out.println("Enter the elements of the first matrix:");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix:");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    b[i][j]=s.nextInt();
                }
            }

    }
    public void add()
    {
        if(r1!=r2 && c1!=c2)
        {
            System.out.println("Addition not possible");
            return;
        }
        c=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of two Matrix:\n");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    public void multiply()
    {
         if(c1!=r2)
        {
            System.out.println("Multiplication not possible");
            return;
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<c1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Product of two Matrix:\n");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
public class Program6{
    public static void main(String args[])
    {
        AddMult obj=new AddMult();
        obj.read();
        obj.add();
        System.out.println("Do you wish to find product of another Matrices?(y/n)");
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch=='n' || ch=='N')
        {
            obj.multiply();
        }
        else
        {
            obj.read();
            obj.multiply();
        }

    }
}