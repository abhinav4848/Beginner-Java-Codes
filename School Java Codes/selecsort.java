//To ask for 10 numbers from user and arrange them in ascending order using Selection sort.
import java.io.*;
public class selecsort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int m[]=new int[10];
        int i,j,min,t;i=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter Number "+(i+1)+":");
            m[i]=Integer.parseInt(read.readLine());
        }
        for(i=0;i<9;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(m[j]<m[min])
                {
                    min=j;
                }
            }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
        }
        System.out.println("\nThe Numbers arranged in ascending order (by selection sort) are as follows:");
        for(i=0;i<10;i++)
        {
            System.out.println(m[i]);
        }
    }
}
