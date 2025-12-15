class UDE extends Exception
{
    String strError;
    public UDE()
    {
        strError="Unknown Error";
    }
    public UDE(String s)
    {
        strError=s;
    }
    public String showError()
    {
        return strError;
    }

}
class Throw
{
    public static void main(String args[])
    {
       int a=5,b=2,c;
         try
         {
              if(b==0)
                throw new UDE("Dr is zero");
              c=a/b;
              System.out.println(c);
         }
         catch(UDE e)
         {
              System.out.println(e.showError());
         }

    }
}