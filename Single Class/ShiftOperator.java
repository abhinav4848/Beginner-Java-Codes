//Using Shift Operators to show change of values (through Binary).
import java.io.*;
public class ShiftOperator
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d,e,f,g,h;
        System.out.println("Enter the value for a:");
            a=Integer.parseInt(read.readLine());
        System.out.println("Enter the value for b:");
            b=Integer.parseInt(read.readLine());
        System.out.println("Enter the value for c:");
            c=Integer.parseInt(read.readLine());
        System.out.println("Enter the value for d:");
            d=Integer.parseInt(read.readLine());
        e=a>>1;
        f=b>>8;
        g=c<<1;
        h=d>>>2;
         System.out.println("The value of "+a+">>1 is "+e);
         System.out.println("The value of "+b+">>8 is "+f);
         System.out.println("The value of "+c+">>1 is "+g);
         System.out.println("The value of "+d+">>2 is "+h);
    }
}
