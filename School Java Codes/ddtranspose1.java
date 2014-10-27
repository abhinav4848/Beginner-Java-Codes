/*To enter numbers in rows and columns and exchange their places form row to column via Double Dimensional array. Modified version of ddtranspose*/
import java.io.*;
public class ddtranspose1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        int m[][]=new int[4][4];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println("Enter "+(i+1)+"*"+(j+1)+" Number: ");
                m[i][j]=Integer.parseInt(read.readLine());
            }
        }
        System.out.println("\nDisplay Of the orginal version of the 4*4 Matrix Order");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nDisplay Of the transpose version of the 4*4 Matrix Order");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
}