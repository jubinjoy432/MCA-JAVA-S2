import java.util.*;
class MatrixAdd{
	public static void main(String args[])
        {
		int a[][],b[][],res[][],r1,c1,r2,c2,i,j;
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("Enter the no. of r and c of the first matrix");
		r1=s.nextInt();
        c1=s.nextInt();
        System.out.println("Enter the no. of r and c of the second matrix");
        r2=s.nextInt();
        c2=s.nextInt();
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("Matrix addition not possible");
            return;
        }
        a=new int[r1][c1];
        b=new int[r2][c2];
        System.out.println("Enter elements of first matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print("Enter a["+i+"]["+j+"]:");
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print("Enter b["+i+"]["+j+"]:");
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("Resultant Matrix after addition:");
        res=new int[r1][c1];
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                 System.out.print(res[i][j]+"\t");
            }
            System.out.println("");
        }

       
    }
}