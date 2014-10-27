/*Enter numbers in 2 different matrices and find each corresponding matrix cell's sum to display in the third matrix.*/
import java.io.*;
public class twomatrixsum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int m[][]=new int[4][4];
        int n[][]=new int[4][4];
        int p[][]=new int[4][4];
        int i,j,k;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println("Enter "+(i+1)+"*"+(j+1)+" Number for the First Matrix:");
                m[i][j]=Integer.parseInt(in.readLine());
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println("Enter "+(i+1)+"*"+(j+1)+" Number for the Second Matrix:");
                n[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("\nDisplay of the First 4*4 matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nDisplay of the Second 4*4 matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nDisplay of the Third 4*4 matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                p[i][j]=m[i][j]+n[i][j];
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}