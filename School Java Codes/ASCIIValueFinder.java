//Finds the ASCII value of the Char entered.
import java.io.*;
public class ASCIIValueFinder
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int a;
        char b,ch;
        do
        {
            System.out.println("Enter value for finding ASCII value of:");
            b=(read.readLine()).charAt(0);
            a=b;
            System.out.println("The ASCII value of "+b+" is "+a);
            System.out.println("Continue?...(Y/y for Yes, any other value for No.):");
            ch=(read.readLine()).charAt(0);
        }
        while(ch=='y'||ch=='Y');
}
}
