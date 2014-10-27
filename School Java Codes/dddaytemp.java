//Enter the max and min Temp. for each day and find a certain day's temp as per user's choice using DDA.
import java.io.*;
public class dddaytemp
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        String m[][]=new String[7][3];
        String day;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(j==0)
                {
                    System.out.println("Enter day "+(i+1)+":");
                }
                if(j==1)
                {
                    System.out.println("Enter the max. temp Of the day:");
                }
                if(j==2)
                {
                    System.out.println("Enter the min. temp of the day:");
                }
                m[i][j]=in.readLine();
            }
        }
        System.out.println("Enter the day you want to find the max. and min. temp. of:");
        day=in.readLine();
        for(i=0;i<3;i++)
        {
            if(day.compareTo(m[i][0])==0)
            {
                System.out.println("\nDay              Max. Temp.              Min. Temp.");
                System.out.println(day+"                 "+m[i][1]+"                       "+m[i][2]);
            }
        }
    }
}