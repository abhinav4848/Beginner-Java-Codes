/*To Display a pattern of words entered by User's Choice. There is a space made between letters.eg:ak becomes a k.  This is modified version of the original.*/
import java.io.*;
public class pattern3mod
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
        String x;
        int a,y,b;
        System.out.println("Enter your word for the pattern printing");
        x=in.readLine();
        x=" "+x;
        y=x.length();
        System.out.println("The original word you entered was:"+x);
        for(b=0;b<=y;b++)
        {
            for(a=0;a<b;a++)
            {
                System.out.print(x.charAt(a)+" ");
            }
            System.out.println(" ");
        }
    }
}