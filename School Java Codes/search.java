//To search for a number in a user entered list of 10 nos. (Using S.D.Array) and give relevant result.
import java.io.*;
public class search
{
public static void main(String args[])throws IOException
{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
int m[]=new int[10];
int a,sh,i,k,d,c;a=0;sh=0;i=0;k=0;d=0;c=0;
for(i=0;i<10;i++)
{
d=d+1;
System.out.println("Enter Number "+d+":");
m[i]=Integer.parseInt(read.readLine());
}
System.out.println("Enter the number you want to search for:");
sh=Integer.parseInt(read.readLine());
for(i=0;i<10;i++)
{
if(m[i]==sh)
{
k=1;
c=c+1;
}
}
if(k==1)
{
System.out.println("The number you searched for, ie, "+sh+" is present "+c+" times");
}
else
{
System.out.println("The number you searched for, ie, "+sh+" is absent.");
}
}
}