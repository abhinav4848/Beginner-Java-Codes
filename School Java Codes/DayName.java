//Suspicions that this program is coming for 2nd term.You enter the day number & it tells you which day is that.
import java.io.*;
public class DayName
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number:");
        String str1=in.readLine();
        int x=str1.length();
        System.out.println("-----");
        for(int i=0;i<x;i++)
        {
            char ch=str1.charAt(i);
            switch(ch)
        {
            case '0':
                System.out.print("Zero ");
                break;
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
           case '9':
                System.out.print("Nine ");
                break;
           default:
                System.out.print("Not a number ");
       }
    }
}
}