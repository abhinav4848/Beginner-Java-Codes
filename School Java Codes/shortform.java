//To accept a name (containing 3 words) and display the initials along with the Sirname.
import java.io.*;
public class shortform
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int x,y,d;d=0;
String a,st;st=" ";
char b;b=' ';
System.out.println("Enter the Three word name.");
a=in.readLine();
x=a.length();
st=st+a.charAt(0);
System.out.println("The short form of the name with Sirname is:");
for(y=0;y<x;y++)
{
b=a.charAt(y);
if(b==' ')
{
d=d+1;
if(d==1)
st=st+"."+(a.charAt(y+1));
if(d==2)
st=st+"."+(a.substring(y,x));
}
}
System.out.println(st);
}
}