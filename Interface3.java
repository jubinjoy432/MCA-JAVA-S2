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
        show();//calling show() method inside print() method is possible
    }
    public void show(){
        System.out.println("show not interface");
    }
}
class Interface3{
    public static void main(String args[]){
        i1 obj;
        obj=new c1();
        obj.disp();
        obj.print();
        //obj.show(); Its not possible because show() is not part of interface i1
    }
}