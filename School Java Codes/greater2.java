//Finds greater of the two numbers using Ternary Operator.
import java.io.*;
public class greater2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter value for a:");
        a=Integer.parseInt(read.readLine());
        System.out.println("Enter value for b:");
        b=Integer.parseInt(read.readLine());
        c = a>b?a:b;
        System.out.println("The Greater number is "+c+".");
    }
}

