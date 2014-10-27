/*To check whether the 3*3 matrix s symmetric or not based on user entry. A matrix is said to be symmetric if the element in the ith row & jth column is equal to element of the jth row & ith column.*/
import java.io.*;
public class ddsymmetric
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i,j,k;k=0;
int m[][]=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter the value in the "+(i+1)+"*"+(j+1)+" matrix.");
m[i][j]=Integer.parseInt(in.readLine());
}
}
System.out.println("The display of the matrix goes here:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(m[i][j]!=m[j][i])
k=1;
}
}
if(k==0)
{
System.out.println("The matrix is Symmetric.");
}
else
{
System.out.println("The matrix is not Symmetric.");
}
}
}