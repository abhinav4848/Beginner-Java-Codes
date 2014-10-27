//Program 10.2
//To print first n natural numbers and their sum.
import java.io.*;
public class NatNumberSum
{
    public static void test(int n)
    {
        int i, sum=0;
        System.out.println("----------");
        for(i=1; i<=n; ++i)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The sum of First "+n+" natural Numbers is "+sum);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of consequtive natural numbers u want 2 find the sum of:");
        int a=Integer.parseInt(in.readLine());
        test(a);
    }
}