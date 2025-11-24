import java.util.*;
class MatrixMult{
	public static void main(String args[])
        {
		int a[][],b[][],res[][],r1,c1,r2,c2,i,j,k;
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("Enter the no. of r and c of the first matrix");
		r1=s.nextInt();
        c1=s.nextInt();
        System.out.println("Enter the no. of r and c of the second matrix");
        r2=s.nextInt();
        c2=s.nextInt();
        if(c1!=r1)
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
	System.out.println("First Matrix:");
	for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                 System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
	System.out.println("Second Matrix:");
	for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                 System.out.print(b[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Resultant Matrix after Multiplication:");
        res=new int[r1][c1];
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                res[i][j]=0;
            }
        }
	for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
	        	for(k=0;k<c1;k++)
	        	{
              		   res[i][j]+=a[i][k]*b[k][j];
		        }
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                 System.out.print(res[i][j]+"\t");
            }
            System.out.println("");
        }

       
    }
}