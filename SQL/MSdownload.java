import java.io.*;
import java.net.*;

class OneClient extends Thread {
    Socket as;
    DataInputStream sin;
    DataOutputStream sout;

    public OneClient(Socket s) throws Exception {
        as = s;
        sin = new DataInputStream(as.getInputStream());
        sout = new DataOutputStream(as.getOutputStream());
    }

    public void run() {
        try {
            String str = "Welcome";
            for (;;) {
                sout.writeUTF("From Server: " + str);
                str = sin.readUTF();
                System.out.println("Client choice: " + str);
                if (str.equals("1")) {
                    String fn = sin.readUTF();
                    System.out.println("Receiving file: " + fn);

                    BufferedWriter bw = new BufferedWriter(new FileWriter(fn));
                    while (true) {
                        String data = sin.readUTF();
                        if (data.equals("-1")) break;
                        bw.write(data);
                        bw.newLine();
                    }
                    bw.flush();
                    bw.close();
                    System.out.println("File " + fn + " received successfully.");
                }

                if (str.equals("3")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("Message from client: " + str);
            }
        } catch (Exception e) {
            System.out.println("Error in client thread: " + e);
        }
    }
}

public class MSdownload {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server started. Waiting for clients...");
            for (;;) {
                Socket as = ss.accept();
                System.out.println("Client connected.");
                OneClient obj = new OneClient(as);
                obj.start();
            }
        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}
