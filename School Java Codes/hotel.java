//A dumb program for the display of room allocation off visitors in a hotel using DDA.
import java.io.*;
public class hotel
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i,j,k;k=0;
String m[][]=new String[3][5];
for(i=0;i<3;i++)
{
for(j=0;j<5;j++)
{
System.out.println("Enter the name of visitor on floor "+(i+1)+", in room no. "+(j+1)+":");
m[i][j]=in.readLine();
}
}
System.out.println("\nDisplay of the name of the visitors:");
for(i=0;i<3;i++)
{
for(j=0;j<5;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
}