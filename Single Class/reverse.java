//To display the entered words in reverse order.
import java.io.*;
public class reverse
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int x,y,z;
String m,p,name;name="";m="";p="";
char b;b=0;
System.out.println("Enter the string:");
name=in.readLine();
name=name+" ";
x=name.length();
for(y=0;y<x;y++)
{
b=(name.charAt(y));
if(b==' ')
{
p=m+" "+p;
m="";
}
else
m=m+b;
}
System.out.println("The string written in the reverse order is:");
System.out.println(p);
}
}