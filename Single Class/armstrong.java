//If a no. 153=(1*1*1)+(5*5*5)+(3*3*3)
import java.io.*;
public class armstrong
{
public static void main(String args[])throws IOException
{
  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
  int a,b,n,sum=0;
  System.out.println("Enter a number to find if it's an 'Armstrong Number' or not:");
  n =Integer.parseInt(read.readLine());
  b=n;
  while(n>0)
  {
      a=n%10;
      sum=sum+a*a*a;
      n=n/10;
  }
  if(b==sum)
  {
      System.out.println(b+" is an Armstrong no.");
  }
  else
  {
      System.out.println(b+" is not an Armstrong Number.");
  }
}
}
 
  