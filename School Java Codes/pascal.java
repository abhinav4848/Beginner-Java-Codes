//To make the Pascal's Triangle.
import java.io.*;
public class pascal
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n;
        int m[]=new int[20];
        System.out.println("Enter the size of the Pascal's Triangle:");
        n=Integer.parseInt(read.readLine());
        m[0]=1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(m[j]+" ");
            }
            System.out.println();
            for(j=i+1;j>0;j--)
            m[j]=m[j]+m[j-1];
        }
    }
}