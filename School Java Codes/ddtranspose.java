/*To enter numbers in rows and columns and exchange their places form row to column via Double Dimensional array (the book one)*/
public class ddtranspose
{
public static void main(String args[])
{
int i,j;
int m[][]={{12,21,13,14},{24,41,51,33},{61,11,30,29},{59,82,41,76}};
int n[][]=new int[4][4];
System.out.println("\nThe nos. of the matrix are:");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
n[j][i]=m[i][j];
}
}
System.out.println("\nThe transpose of the matrix is:");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(n[i][j]+" ");
}
System.out.println();
}
}
}