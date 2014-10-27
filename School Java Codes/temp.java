//Converting Temperature using Input from user and converting by choice Using Switch statement.
import java.io.*;
class temp
{
public static void main(String args[])throws IOException
{
int m,n;
BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Press 1 to convert from Celsius to Farenheit");
System.out.println("Press 2 to convert form Farenheit to Celsius");
m=Integer.parseInt(bobj.readLine());
switch (m)
{
case 1:
{
double c,d;
System.out.println("Enter temp. value");
c=Double.parseDouble(bobj.readLine());
d=9*c/5+32;
System.out.println(d);
break;
}
case 2:
{
double c,d;
System.out.println("Enter temp. value");
c=Double.parseDouble(bobj.readLine());
d=(5*c-160)/9;
System.out.println(d);
break;
}
default:
{
System.out.println("It is Wrong Choice");
}
}
}
}