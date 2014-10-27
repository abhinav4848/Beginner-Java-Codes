//Enter numbers in rows & columns and find each row's sum and then each column's.
import java.io.*;
public class matrixsum
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int m[][]=new int[4][4];
int s,c,r,i,j;
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.println("Enter "+(i+1)+"*"+(j+1)+" Number:");
m[i][j]=Integer.parseInt(in.readLine());
}
}
System.out.println("\nDisplay of the 4*4 matrix");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
System.out.println("\nThe sum of each of the rows:");
for(i=0;i<4;i++)
{
r=0;
for(j=0;j<4;j++)
{
r=r+m[i][j];
}
System.out.println("The sum of row "+(i+1)+" is: "+r);
}
System.out.println("\nThe sum of each of the columns:");
for(i=0;i<4;i++)
{
c=0;
for(j=0;j<4;j++)
{
c=c+m[j][i];
}
System.out.println("The sum of column "+(i+1)+" is: "+c);
}
}
}