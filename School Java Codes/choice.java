//User enters two nos. and the program finds their sum, diff, product. according to user's choice.
import java.io.*;
public class choice
{
    public static void main(String args[])throws IOException
    {
        int a,b,ch;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.print("Enter First Number:");
        a=Integer.parseInt(in.readLine());
        System.out.print("Enter Second Number:");
        b=Integer.parseInt(in.readLine());
        System.out.println("Enter 1 to Add, 2 to Subtract, 3 to Multiply.");
        ch=Integer.parseInt(in.readLine());
        if(ch==1)
        System.out.println("The Sum of the Two Nos. is "+(a+b));
        else
        if(ch==2)
        System.out.println("The Difference of the Two Nos. is "+(a-b));
        else
        if(ch==3)
        System.out.println("The Product of the Two Nos. is "+(a*b));
        else
        System.out.println("Sorry, the Value you Entered is Invalid.");
    }
}
