//To create a series with a pattern.
import java.io.*;
public class series
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,a;
double s=1;
System.out.println("Enter any Number:");
a=Integer.parseInt(in.readLine());
for(i=1;i<10;i++)
{
s=s+Math.pow (a,i);
System.out.println(s);
}
}
}