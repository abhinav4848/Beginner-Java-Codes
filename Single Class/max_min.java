/*Input 10 nos. and find their greatest and smallest using Sinlg Dimensional array. Made Without Looking at the Book.*/
import java.io.*;
public class max_min
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,max,min;i=0;max=0;
        int c,d;c=0;d=0;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            c=c+1;
            System.out.println("Enter Number "+c+":");
            m[i]=Integer.parseInt(in.readLine());
        }
        min=m[0];
        System.out.println("\nDisplay of the 10 nos:");
        for(i=0;i<10;i++)
        {
            d=d+1;
            System.out.println("Value of Number "+d+": "+m[i]);
            if(max<m[i])
            {
                max=m[i];
            }
            if(min>m[i])
            {
                min=m[i];
            }
        }
        System.out.println("\nThe Greatest Number is: "+max);
        System.out.println("The Smallest Number is: "+min);
        //System.out.println("\n\nThis Program is The Copyright(c) of Abhinav Kumar. Handle With care.");
    }
}