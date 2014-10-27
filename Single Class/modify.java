//To modify a given string and replace some of the words.
import java.io.*;
public class modify
{
public static void main(String args[])
{
int x,z;
String a,y="",t="";
char p;
a="January 26 is celebrated as the Republic Day of India.";
System.out.println("The original String:");
System.out.println(a);
a=a+" ";
x=a.length();
for(z=0;z<x;z++)
{
p=a.charAt(z);
if(p!=' ')
t=t+p;
else
{
if(t.compareTo("26")==0)
y=y+" "+"15";
else
if(t.compareTo("January")==0)
y=y+""+"August";
else
if(t.compareTo("Republic")==0)
y=y+" "+"Independence";
else
y=y+" "+t;
t="";
}
}
System.out.println("The modified Srtring is:");
System.out.println(y);
}
}