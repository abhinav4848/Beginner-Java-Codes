//To ask for 10 numbers from user and arrange them in ascending order using Bubble sort.
import java.io.*;
public class bubblesort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int m[]=new int[10];
        int i,j;i=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter Number "+(i+1)+":");
            m[i]=Integer.parseInt(read.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(m[j]>m[j+1])   /*Change the '>' symbol to '<' for descending order.*/
                {
                    int t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println("\nThe Numbers arranged in ascending order (by bubble sort) are as follows:");
        for(i=0;i<10;i++)
        {
            System.out.println(m[i]);
        }
    }
}