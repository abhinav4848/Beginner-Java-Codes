//To display the sum of matrix elements via Double Dimensional array.
import java.io.*;
public class ddsum
{
public static void main(String args[])throws IOException
{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
int i,j,s;s=0;
int m[][]=new int[4][5];
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
System.out.println("Enter "+(i+1)+"*"+(j+1)+" Number: ");
m[i][j]=Integer.parseInt(read.readLine());
}
}
System.out.println("Display Of 4*5 Matrix Order");
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
s=s+m[i][j];
System.out.print(m[i][j]+" ");
}
System.out.println();
}
System.out.println("The sum of the elements of the matrix is:"+s);
}
}