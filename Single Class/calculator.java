//prog 9.3
//Calculator of two values and +,-,*,/
import java.io.*;
public class calculator
{
    public static void Calculate(double a, double b, char oper)
    {
        double result=0;
        if(oper=='+')
        {
            result=a+b;
        }
        else if(oper=='-')
        {
            result=a-b;
        }
        else if(oper=='*')
        {
            result=a*b;
        }
        else if(oper=='/')
        {
            result=a/b;
        }
        else
        {
            System.out.println("Invalid Option");
        }
        System.out.println("Calculated Result is: "+result);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first value:");
        double a=Double.parseDouble(in.readLine());
        System.out.println("Enter second value:");
        double b=Double.parseDouble(in.readLine());
        System.out.println("Enter symbol to operate on "+a+" and "+b+":");
        char oper=(in.readLine()).charAt(0);
        Calculate(a,b,oper);
    }
}