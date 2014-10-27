//Reversing places of nos. in a value. i.e. 32 becomes 23, 115 becoming 511. etc.
import java.io.*;
class Reverse12
{
public static void main(String args[])throws IOException
{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
int  a[]=new int[10];
int b[]=new int[10];
int rev,n,i,c;
rev=0;
c=0;
for(i=0;i<10;i++)
{
rev=rev+1;
System.out.println("Input "+rev+" Number");
a[i]=Integer.parseInt(read.readLine());
}
for(i=0;i<10;i++)
{
rev=0;
b[i]=a[i];
while(a[i]>0)
{
n=a[i]%10;
rev=rev*10+n;
a[i]=a[i]/10;
}
c=c+1;
System.out.println("Input Number "+c+" Is "+b[i]+"            "+"Reverse Number "+c+" Is "+rev);
}
}
}



