//Table of infinite nos. via method overloading. Diplays Table of the next Number.
import java.io.*;
class table
{
public static void main(String args[])throws IOException
{
char ch='Y';
int n=2,t;
BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
while((ch=='y')||(ch=='Y'))
{
for(int a=1;a<=10;a++)
{
t=n*a;
System.out.println(n+"*"+a+"="+t);
}
System.out.println("Continue?...(Y/N):");
ch=(bobj.readLine()).charAt(0);
if(ch=='n'||ch=='N')
{
break;
}
if(ch=='y'||ch=='y')
{
n++;
}
}
}
}