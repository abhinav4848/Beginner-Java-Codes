//Program checks if the given no. is even or odd but terminates if 0 is entered from console.
import java.io.*;
public class evenodd
{
public static void main(String args[])throws IOException
{
int i,n;n=1;
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
while (n!=0)
{
System.out.println("Enter a number.(Enter 0 to leave this program.)");
n=Integer.parseInt(in.readLine());
if (n==0)
break;
if (n%2==0)
System.out.println(n+" is an even number.");
else
System.out.println(n+" is an odd number.");
}
}
}