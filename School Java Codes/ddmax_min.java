//To display the greatest and the smallest number of matrix elements via Double Dimensional array.
import java.io.*;
public class ddmax_min
{
public static void main(String args[])throws IOException
{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
int i,j,max,min;
int m[][]=new int[4][4];
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.println("Enter "+(i+1)+"*"+(j+1)+" Number: ");
m[i][j]=Integer.parseInt(read.readLine());
}
}
System.out.println("\nDisplay Of 4*4 Matrix Order");
max=m[0][0];
min=m[0][0];
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
if(max<m[i][j])
{
max=m[i][j];
}
if(min>m[i][j])
{
min=m[i][j];
}
System.out.print(m[i][j]+" ");
}
System.out.println();
}
System.out.println("\nThe Longest Number of the elements of the matrix is: "+max);
System.out.println("The smallest Number of the elements of the matrix is: "+min);
}
}