import java.io.*;
import java.net.*;
class OneClient extends Thread
{
	Socket as;
	DataInputStream sin,kin;
	DataOutputStream sout;
    FileOutputStream fout;
    String fn;
	public OneClient(Socket s) throws Exception
	{
		as =s;
		sin=new DataInputStream(as.getInputStream());
		sout=new DataOutputStream(as.getOutputStream());
	}
	public void run()
	{
		try
		{
			String str="Welcome";
			for(;;)
			{
				sout.writeUTF("From Server:"+str);
				str= sin.readUTF();
                if(str.equals("1"))
				{
                    fn= sin.readUTF();
                    fout=new FileOutputStream(fn);
                    while(true)
                     {
                         String data=sin.readUTF();
                         if(data.equals("-1"))
                            break;
                          fout.write(data.getBytes());
                      }
				}
				if(str.equals("2"))
				{
					fn= sin.readUTF();
					FileInputStream fin=new FileInputStream(fn);
                    int data;
                    char ch;
                    while ((data = fin.read()) != -1) {
                        ch = (char) data;  
                        sout.writeUTF(String.valueOf(ch));
                    }
                    sout.writeUTF("-1");
					fin.close();


				}
				if(str.equals("3"))
					break;
				System.out.println("From  Client:"+str);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
class MSdownload
{
	public static void main(String args[])
	{
		ServerSocket ss;
		try
		{
			ss=new ServerSocket(1234);
			for(;;)
			{
				System.out.println("Server Waiting.....");
				Socket as=ss.accept();
				System.out.println("Client connected.....");
				OneClient obj=new OneClient(as);
				obj.start();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
	