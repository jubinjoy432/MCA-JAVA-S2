import java.io.*;
import java.util.*;
class Employee{
    int eno;
    String ename;
    float esal;
    public void read(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter eno:");
        eno=s.nextInt();
        s.nextLine();
        System.out.print("Enter name:");
        ename=s.nextLine();
        System.out.print("Enter salary:");
        esal=s.nextFloat();
    }
    public void display(){
        System.out.println("eno:"+eno);
        System.out.println("name:"+ename);
        System.out.println("salary:"+esal);
    }
    public int search(int eno){
        if(this.eno==eno){
            return 1;
        }
        else
            return 0;
    }
}

class Program18{
    public static void main(String args[]){
        Employee obj[];
        int n,eno,found=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of employees:");
        n=s.nextInt();
        obj = new Employee[n];
        for(int i=0;i<n;i++){
            obj[i]=new Employee();
            System.out.println("Enter details of employee "+(i+1)+":");
            obj[i].read();
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of employee "+(i+1)+":");
            obj[i].display();
        }
         System.out.println("Enter the eno of employee to be searched:");
         eno=s.nextInt();
        for(int i=0;i<n;i++){
            found=obj[i].search(eno);
            if(found==1){
                 System.out.println("Details of employee searched:");
                 obj[i].display();
                 break;
            }
        }
        if(found==0){
             System.out.println("Employee Not Found");
        }
    }
}
