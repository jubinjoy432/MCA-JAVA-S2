class PrinterThread extends Thread {
    String documentName;
    int pages;

    PrinterThread(String documentName, int pages) {
        this.documentName = documentName;
        this.pages = pages;
    }

    public void run() {
        System.out.println("Printing started: " + documentName + " (" + pages + " pages)");
        for (int i = 1; i <= pages; i++) {
            System.out.println(documentName + " - Printing page " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Printing interrupted: " + documentName);
            }
        }
        System.out.println("Printing finished: " + documentName);
    }
}

class Program30 {
    public static void main(String args[]) {
        // Simulate multiple print jobs
        PrinterThread job1 = new PrinterThread("Document1", 3);
        PrinterThread job2 = new PrinterThread("Document2", 4);
        PrinterThread job3 = new PrinterThread("Document3", 2);

        // Start all threads (without synchronization)
        job1.start();
        job2.start();
        job3.start();
    }
}
