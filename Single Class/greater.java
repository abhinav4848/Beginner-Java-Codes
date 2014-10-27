//user enters 2 nos. and program finds which is greater
import java.io.*;
public class greater
{
public static void main(String args[])throws IOException
{
int a,b;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader ak=new BufferedReader(in);
System.out.print("Enter First Number for a:");
a=Integer.parseInt(ak.readLine());
System.out.print("Enter Second Number for b:");
b=Integer.parseInt(ak.readLine());
if(a<b)
System.out.println("The greater no. is b="+b);
else
System.out.println("The greater no. is a="+a);
}
}