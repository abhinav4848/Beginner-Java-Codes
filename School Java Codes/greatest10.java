//To display the greatest number in a list entered by user using Single Dimensional array.
import java.io.*;
public class greatest10
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,max,c,d;max=0;c=0;d=0;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            d=d+1;
            System.out.println("Enter "+d+" Number:");
            m[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("Display of the 10 Nos:");
        for(i=0;i<10;i++)
        {
            c=c+1;
            System.out.println("Value of "+c+" Number = "+  m[i]);
            if(max<m[i])
            {
                max=m[i];
            }
        }
        System.out.println("\nThe Greatest Number is= "+max);
    }
}