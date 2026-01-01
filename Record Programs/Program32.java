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

class ProducerConsumer {
    int item;
    boolean available = false;

    public synchronized void produce(int value) {
        try {
            if (available) {
                wait();
            }
            item = value;
            System.out.println("Produced: " + item);
            available = true;
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            if (!available) {
                wait();
            }
            System.out.println("Consumed: " + item);
            available = false;
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        int value = 1;
        while (true) {
            pc.produce(value);
            value++;
        }
    }
}

class Consumer extends Thread {
    ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        while (true) {
            pc.consume();
        }
    }
}

class Program32 {
    public static void main(String args[]) {
        Book q=new Book();
        Writer p=new Writer(q);
        Reader r=new Reader(q);
        p.start();
        r.start();
        ProducerConsumer pc = new ProducerConsumer();
        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);
        producer.start();
        consumer.start();
    }
}

