/*To find the presence of a number in a given set of numbers entererd by user through Binary Search. Numbers must be entered in ascending order.*/
import java.io.*;
public class binsearch
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int m[]=new int[10];
        int a,sh,k,i,p,ub,lb;a=0;sh=0;k=0;i=0;p=0;ub=9;lb=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter Number "+(i+1)+" in ascending order:");
            m[i]=Integer.parseInt(read.readLine());
        }
        System.out.println("Enter the value you want to search for:");
        sh=Integer.parseInt(read.readLine());
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]==sh)
            {
                k=1;
                break;
            }
            if(m[p]<sh)
            {
                lb=p+1;
            }
            if(m[p]>sh)
            {
                ub=p-1;
            }
        }
        if(k==1)
        {
            System.out.println("The number, "+sh+" was successfully found.");
        }
        else
        {
            System.out.println("The number was unsuccessfully found.");
        }
    }
}