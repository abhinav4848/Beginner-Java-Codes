//Enter numbers in rows & columns and find the sum of the left diagonal and the right diagonal separately.
import java.io.*;
public class matrixdiag
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int m[][]=new int[4][4];
        int s,ld,rd,i,j,k;ld=0;rd=0;
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
        for(i=0;i<4;i++)
        {
            ld=ld+m[i][i];
        }
        System.out.println("\nSum of the elements of the left diagonals:"+ld);
        k=3;
        for(i=0;i<4;i++)
        {
            rd=rd+m[i][k];
            k=k--;
        }
        System.out.println("The sum of the elements of the right diagonals:"+rd);
    }
}