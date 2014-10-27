//To count the no. of vowels iin a String.
import java.io.*;
public class vowels
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader bobj=new BufferedReader(read);
int x,y,v,c,s;v=0;c=0;s=0;
String a;
char b;
System.out.println("Enter your String:");
a=bobj.readLine();
x=a.length();
for(y=0;y<x;y++)
{
b=(a.charAt(y));
if((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u')
||(b=='A')||(b=='E')||(b=='I')||(b=='O')||(b=='U'))
{
v=v+1;
}
else
{
if(b==' ')
{
s=s+1;
}
else
{
c=c+1;
}
}
}
System.out.println("The number of Vowels in your string="+v);
System.out.println("The number of Consonants in your string="+c);
System.out.println("The number of Space in your string="+s);
}
}