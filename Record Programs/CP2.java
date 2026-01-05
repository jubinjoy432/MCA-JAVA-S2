import java.io.*;
class CFile{
    public String readFile(String fn){
        String data="";
        FileInputStream fin;
        try{
            fin = new FileInputStream(fn);
            byte []b=new byte[fin.available()];
            fin.read(b);
            data=new String(b);
            fin.close();
        }
        catch(Exception e){
        
        }
        return data;
    }
    public void writeFile(String fn,String data){
        FileOutputStream fout;
        try{
            fout=new FileOutputStream(fn);
            byte b[]=data.getBytes();
            fout.close();
        }
        catch(Exception e){
        
        }
    }
    public void copyFile(String sfn,String dfn)
    {
        writeFile(dfn,readFile(sfn));
        System.out.println("Successfully Copied "+sfn+" to "+dfn);
    }
}
class CP2{
        public static void main(String args[])
        {
            if (args.length==2)
            {
                CFile obj=new CFile();
                obj.copyFile(args[0],args[1]);
            }
            else
            {
                System.out.println("Insufficient Arguments");
            }
            
        }
}