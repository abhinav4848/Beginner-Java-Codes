//To ask for 10 numbers from user and arrange them in ascending order using Bubble sort.
import java.io.*;
public class bubnamesort
{
public static void main(String args[])throws IOException
{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
String m[]=new String[10];
int i,j;i=0;
for(i=0;i<10;i++)
{
System.out.println("Enter Name "+(i+1)+":");
m[i]=read.readLine();
}
for(i=0;i<9;i++)
{
for(j=0;j<9;j++)
{
if(m[j].compareTo(m[j+1])>0)   /*Change the '>' symbol to '<' for descending order.*/
{
String t=m[j];
m[j]=m[j+1];
m[j+1]=t;
}
}
}
System.out.println("\nThe Names arranged in ascending order (by bubble sort) are as follows:");
for(i=0;i<10;i++)
{
System.out.println(m[i]);
}
}
}