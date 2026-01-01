class Printer {
    synchronized void print(String documentName, int pages) {
        System.out.println("Printing started: " + documentName);
        for (int i = 1; i <= pages; i++) {
            System.out.println(documentName + " - Printing page " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        System.out.println("Printing finished: " + documentName + "\n");
    }
}
class PrinterThread extends Thread {
    Printer printer;
    String documentName;
    int pages;

    PrinterThread(Printer printer, String documentName, int pages) {
        this.printer = printer;
        this.documentName = documentName;
        this.pages = pages;
    }

    public void run() {
        printer.print(documentName, pages);
    }
}
class Program31 {
    public static void main(String args[]) {

        Printer printer = new Printer();

        PrinterThread job1 = new PrinterThread(printer, "Document1", 3);
        PrinterThread job2 = new PrinterThread(printer, "Document2", 4);
        PrinterThread job3 = new PrinterThread(printer, "Document3", 2);

        job1.start();
        job2.start();
        job3.start();
    }
}
