//To Check if the entered Number is Prime or Not.
import java.io.*;
public class prime
{
public static void main(String args[])throws IOException
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int a,b,c=0,n;
    System.out.println("Enter a Number to find if it's a prime or not:");
    a=Integer.parseInt(in.readLine());
    n=a;
    for(b=1;b<=n;b++)
    {
        if(a%b==0)
        {
            c=c+1;
        }
    }
    if(c==2)
    {
       System.out.println(a+" is a Prime Number.");
    }
    else
    {
        System.out.println(a+" is not a Prime Number.");
    }
}
}