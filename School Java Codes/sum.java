//User enters two nos. and program displays the nos. and finds their sum.
import java.io.*;
class sum
{
public static void main(String args[])throws IOException
{
int a,b;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader ak=new BufferedReader(in);
System.out.print("Enter First Number:");
a=Integer.parseInt(ak.readLine());
System.out.print("Enter Second Number:");
b=Integer.parseInt(ak.readLine());
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("The sum of the two numbers is "+(a+b));
int c = (10/3)*7;
System.out.println("c="+c);
}
}