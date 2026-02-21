import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.*;
public class MCdownload {
    public static void main(String args[]) {
        try {
            Socket cs = new Socket("localhost", 1234);

            DataInputStream sin = new DataInputStream(cs.getInputStream());
            DataOutputStream sout = new DataOutputStream(cs.getOutputStream());
            Scanner kin = new Scanner(System.in);

            for (;;) {
                String serverMsg = sin.readUTF();
                System.out.println(serverMsg);

                System.out.println("Choose 1.upload 2.download 3.quit:");
                String choice = kin.nextLine();
                if(choice.isEmpty()) continue;

                sout.writeUTF(choice);
                System.out.println("Sent choice: " + choice);

                if (choice.equals("1")) 
                {
                    System.out.println("Enter the file name to upload:");
                    String fn = kin.nextLine();
                    sout.writeUTF(fn); 
                    System.out.println("Sending file: " + fn);

                    FileInputStream fin=new FileInputStream(fn);
                    int data;
                    char ch;
                    while ((data = fin.read()) != -1) {
                        ch = (char) data;  
                        sout.writeUTF(String.valueOf(ch));
                    }
                    sout.writeUTF("-1");
                    fin.close();
                    System.out.println("File " + fn + " Uploaded successfully.");
                }
                if(choice.equals("2"))
                {
                    System.out.println("Enter the file name to download:");
                    String fn = kin.nextLine();
                    sout.writeUTF(fn);
                    FileOutputStream fout=new FileOutputStream(fn);
                    while(true)
                     {
                         String data=sin.readUTF();
                         if(data.equals("-1"))
                            break;
                          fout.write(data.getBytes());
                      }
                       System.out.println("File " + fn + " Downloaded successfully.");
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
