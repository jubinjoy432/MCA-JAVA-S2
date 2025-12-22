import java.io.*;
class A{
    int a;
    public A(){
        a=0;
    }
    public A(int a){
        this.a=a;
    }
    void display(){
        System.out.println("a="+a);
    }
}

class B extends A{
    int b;
    public B(){
        b=0;
    }
    public B(int a,int b){
        super(a);
        this.b=b;
    }
    void display(){
        super.display();
        System.out.println("b="+b);
    }
}
class Program17{
    public static void main(String args[]){
        B obj=new B(10,20);
        obj.display();
    }
}