//User enters a list of names, enters an alphabet, and pc finds all names beginning with that alphabet.
import java.io.*;
public class alphaname
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i,a,c,location;c=0;location=0;
char ch;
String b;b="";
String m[]=new String[10];
System.out.println("Enter 10 names in any order:");
for(i=0;i<100;i++)
{
m[i]=in.readLine();
}
System.out.println("Now, Enter an alphabet to search for all names beginning with that letter:");
//ch=(char)(in.read());
ch=(in.readLine()).charAt(0);
for(i=0;i<10;i++)
{
b=m[i];
if(b.charAt(0)==ch)
{
System.out.println(m[i]);
c=c+1;
}
}
if(c==0)
{
System.out.println("No name found begining with"+ch+".");
}
}
}