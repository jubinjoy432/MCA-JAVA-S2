import java.io.*;
import java.util.*;
class UDE extends Exception
{
    String error;
    public UDE()
    {
        error="Invalid Password";
    }
    public UDE(String s)
    {
        error=s;
    }
    public String showError()
    {
        return error;
    }
}
class UDEpassword
{
    public static void main(String args[])
    {
        String p;
        int count=0,scount=0,sflag,upper=0,lower=0;
        char prev =' ';
        Scanner s=new Scanner(System.in);
        System.out.println("Rules:\n1.Must be alphanumeric\n2.Atleast one uppercase and one lowercase letter\n");
        System.out.println("3.Atleast one Special Character( @,*,(,),{,},[,],= )\n4.Should not have any consecutive repetition of characters");
        System.out.println("\n5.Atleast 8 characters");
        System.out.println("\n Enter the password:");
        p=s.nextLine();
        try
        {
            for(int i=0;i<p.length();i++)
            {   
                sflag=0;
                if(!Character.isLetter(p.charAt(i)) && !Character.isDigit(p.charAt(i)))
                {
                    switch(p.charAt(i))
                    {
                        case '@':
                        case '*':
                        case '!':
                        case '(':
                        case ')':
                        case '{':
                        case '}':
                        case '[':
                        case ']':
                        case '=':sflag=1;
                                 scount++;break;
                        default:throw new UDE("Password Must be Alphanumeric");;
                    }
                }
                if(Character.isUpperCase(p.charAt(i)))
                    upper=1;
                if(Character.isLowerCase(p.charAt(i)))
                    lower=1;
                if(i==0)
                    prev=p.charAt(i);
                else
                {
                    if(p.charAt(i)==prev)
                    {
                        throw new UDE("Should not have any consecutive repetition of characters");
                    }
                } 
            }
            if(lower==0)
                throw new UDE("Should have atleast one lowercase letter");
            if(upper==0)
                throw new UDE("Should have atleast one Uppercase letter");
            if(scount==0)
                throw new UDE("Should have atleast one Special Character");
            if(p.length()<8)
                throw new UDE("Atleast 8 characters needed");
        }
        catch(UDE e)
        {
            System.out.println(e.showError());
        }

    }
}
