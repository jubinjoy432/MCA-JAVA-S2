import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MCdownload {
    public static void main(String args[]) {
        try {
            Socket cs = new Socket("localhost", 1234);

            DataInputStream sin = new DataInputStream(cs.getInputStream());
            DataOutputStream sout = new DataOutputStream(cs.getOutputStream());
            Scanner kin = new Scanner(System.in);

            for (;;) {
                // read message from server
                String serverMsg = sin.readUTF();
                System.out.println(serverMsg);

                // ask user for choice
                System.out.println("Choose 1.upload 2.download 3.quit:");
                String choice = kin.nextLine();
                if(choice.isEmpty()) continue;

                sout.writeUTF(choice); // send menu choice
                System.out.println("Sent choice: " + choice);

                // Upload file
                if (choice.equals("1")) {
                    System.out.println("Enter the file name to upload:");
                    String fn = kin.nextLine();
                    sout.writeUTF(fn); // send filename
                    System.out.println("Sending file: " + fn);

                    BufferedReader br = new BufferedReader(new FileReader(fn));
                    String line;
                    while ((line = br.readLine()) != null) {
                        sout.writeUTF(line);
                        System.out.println("Sent line: " + line);
                    }
                    sout.writeUTF("-1"); // EOF marker
                    br.close();
                    System.out.println("File " + fn + " sent successfully.");
                }

                if (choice.equals("3")) {
                    System.out.println("Exiting client.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}
