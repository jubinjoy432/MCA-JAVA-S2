import java.io.*;
class Book
{
    int data;
    boolean f=false;

    public synchronized void read(int a)
    {
        try{
            if(f==true){
                wait();
            }
            data=a;
            System.out.println("read:"+data);
            f=true;
            notify();
        }
        catch(Exception e){}
    }

    public synchronized void write(){
        try{
            if(f==false)
                wait();
            System.out.println("Write"+data);
            f=false;
            notify();
        }
        catch(Exception e){}
    }
}

class Writer extends Thread{
    Book o;
    public Writer(Book o){
        this.o=o;
    }
    public void run(){
        int i=1;
        while(true){
            o.read(i);
            i++;
        }
    }
}
class Reader extends Thread{
    Book o;
    public Reader(Book o){
        this.o=o;
    }
    public void run(){
        while(true){
            o.write();
        }
    }
}

class ReadersWriters{
    public static void main(String args[]){
        Book q=new Book();
        Writer p=new Writer(q);
        Reader r=new Reader(q);
        p.start();
        r.start();
    }
}

