//Program 9.7
//Program to calculate & print roots of a quadratic equation ax(2)+bx+c=0 (a!=0).
//The coeffecients of quadratic equations na,b,c are received as parameters.
import java.io.*;
public class QuadraticEq
{
   public static void roots(double a, double b, double c)
   {
       double d, root1, root2;
        if (a==0)
        {
            System.out.println("Value shouldn't be zero. Program Aborted.");
        }
        else
        {
            d=b*b-4*a*c;
            if (d>0)
            {
                root1=(-b+Math.sqrt(d))/(2*a);
                root2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("Roots are Real and Unequal.");
                System.out.println("Root1: "+root1+" Root2: "+root2);
            }
            else
            {
                System.out.println("Roots are Complex and Imaginary.");
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the roots one after another: ");
        double a=Double.parseDouble(in.readLine());
        double b=Double.parseDouble(in.readLine());
        double c=Double.parseDouble(in.readLine());
        roots(a,b,c);
    }
}