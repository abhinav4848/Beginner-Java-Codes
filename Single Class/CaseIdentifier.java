//program 9.6
//program to find if entered character is uppercase, lowercase or digit or special character.
import java.io.*;
public class CaseIdentifier
{
    public static void test(char ch)
    {
        if (ch>=48 && ch<=57)
        {
            System.out.println(ch+" is a digit.");
        }
        else  if (ch>=65 && ch<=90)
        {
            System.out.println(ch+" is an uppercase character.");
        }
        else  if (ch>=97 && ch<=122)
        {
            System.out.println(ch+" is a lowercase character.");
        }
        else
        {
            System.out.println(ch+" is a special character.");
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 characters to find what type are they of: ");
        char ch1=(in.readLine()).charAt(0);
        char ch2=(in.readLine()).charAt(0);
        char ch3=(in.readLine()).charAt(0);
        test(ch1);
        test(ch2);
        test(ch3);
    }
}