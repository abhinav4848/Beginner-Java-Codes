//Merging data of two arrays into one
import java.io.*;
public class Merge
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int P[]=new int[6];
        int Q[]=new int[4];
        int R[]=new int[10];
        int i,j;
        for(i=0; i<6; i++)
        {
            System.out.println("Enter a Number:");
            P[i]=Integer.parseInt(ak.readLine());
        }
        for(i=0; i<4; i++)
        {
            System.out.println("Enter a Number:");
            Q[i]=Integer.parseInt(ak.readLine());
        }
        for(i=0; i<6; i++)
        {
            R[i]=P[i];
        }
        for(i=6, j=0; j<4; i++, j++)
        {
            R[i]=Q[j];
        }
        for(i=0; i<10; i++)
        {
            System.out.println("After Merging");
            System.out.println(R[i]);
        }
    }
}