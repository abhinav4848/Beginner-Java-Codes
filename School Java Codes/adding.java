//To find the sum of any ten natural nos. entered by user.
import java.io.*;
public class adding
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int a,n,s;s=0;
for(a=1;a<=10;a++)
{
System.out.println("Enter Number:");
n=Integer.parseInt(in.readLine());
s=s+n;
}
System.out.println("The sum of any 10 nos. is:"+s);
}
}