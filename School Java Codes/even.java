//User enters a no. and program finds whether it is odd or even
import java.io.*;
public class even
{
    public static void main(String args[])throws IOException
    {
        int a;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.print("Enter any Number:");
        a=Integer.parseInt(in.readLine());
        if(a%2==0)
        System.out.println("The Number is Even.");
        else
        System.out.println("The Number is Odd.");
    }
}