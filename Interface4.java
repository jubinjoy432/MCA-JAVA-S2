import java.util.*;//multiple interface
interface i1{
    public void disp();
}
interface i2{
    public void print();
}
class c1 implements i1,i2{
    public void disp(){
        System.out.println("In disp interface");
        print();
    }
    public void print(){
        System.out.println("In print interface");
        show();//calling show() method inside print() method is possible
    }
    public void show(){
        System.out.println("show not interface");
    }
}
class Interface4{
    public static void main(String args[]){
        i1 obj1;
        i2 obj2;
        obj1=new c1();
        obj1.disp();
        obj2=new c1();
        obj2.print();
        //obj.show(); Its not possible because show() is not part of interface i1
    }
}
