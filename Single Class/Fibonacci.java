//To display as many nos. of the Fibonacci series as Demanded.
import java.io.*;
public class Fibonacci
{
public static void main(String args[])throws IOException
{
  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
  long a=0,b=1,c=0,n=3,d;
  System.out.println("Enter the Number of Numbers u want the series to display\n(Enter 4 or more):");
  d=Integer.parseInt(read.readLine());
  System.out.println("Here is your Fibonacci Series:");
  System.out.println(a);
  System.out.println(b);
  do
  {
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
      n=n+1;
  }
  while(n<=d);
}
}