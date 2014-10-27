//To find if the year entered by a user is leap or not. 1900 is not a leap Year.
import java.io.*;
public class Leap
{
public static void main(String args[])throws IOException
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int a;
    System.out.println("Enter a year to find the leap year of:");
    a=Integer.parseInt(in.readLine());
    //if((a%4==0)&&((a%400==0)||(a%100!=0)))
    if((a%4==0 && a%100!=0) || (a%400==0))
    {
        System.out.println(a+" is a Leap Year so get thrilled.");
    }
    else
    {
        System.out.println(a+" is not a Leap Year bad lox.");
    }
}
}