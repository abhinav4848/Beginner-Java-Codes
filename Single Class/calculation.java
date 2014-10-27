//User enters two nos. and program finds its sum, diff. and product.
import java.io.*;
class calculation
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b;
a=0;b=0;
DataInputStream in=new DataInputStream(System.in);
System.out.print("Enter value for a:");
a=Integer.parseInt(br.readLine());
System.out.print("Enter value for b:");
b=Integer.parseInt(br.readLine());
System.out.println("The Sum of the two Numbers is "+(a+b));
System.out.println("The Difference of the two Numbers is "+(a-b));
System.out.println("The Product of the two Numbers is "+(a*b));
}
}