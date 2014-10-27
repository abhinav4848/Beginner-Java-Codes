//Summing using input from user via Data Input Stream.
import java.io.*;
public class dsum
{
public static void main(String args[])
{
try
{
//Try block starts here.
int a,b;a=0;b=0;
DataInputStream in=new DataInputStream(System.in);
System.out.print("Enter the value of a:");
a=Integer.parseInt(in.readLine());
System.out.print("Enter the value of b:");
b=Integer.parseInt(in.readLine());
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("The Sum of the two nos. is="+(a+b));
System.out.println("The Difference of the two nos. is="+(a-b));
//Try block ends here.
}
catch (Exception e){}
}
}