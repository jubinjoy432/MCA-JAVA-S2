import java.util.*;
interface i1{
    public void disp();
    public void print();
}
class c1 implements i1{
    public void disp(){
        System.out.println("In disp interface");
    }
    public void print(){
        System.out.println("In print interface");
    }
    public void show(){
        System.out.println("show not interface");
    }
}
class Interface1{
    public static void main(String args[]){
        c1 obj=new c1();
        obj.disp();
        obj.print();
        obj.show();
    }
}