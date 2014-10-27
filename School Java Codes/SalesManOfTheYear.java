//program 9.5
//to find the commission of a salesman based on his sales.
import java.io.*;
public class SalesManOfTheYear
{
    public static void test(float sales)
    {
        double comm=0;
        if (sales>5000)
        {
            if(sales>12000)
            {
                if(sales>22000)
                {
                    if(sales>30000)
                    {
                        comm=sales*0.15;
                    }
                    else
                    {
                        comm=sales*0.10;
                    }
                }
                else
                {
                    comm=sales*0.07;
                }
            }
            else
            {
                comm=sales*0.03;
            }
        }
        else
        {
            comm=0;
        }
        System.out.println("For Sales "+sales+" The commission is "+comm);
    }
   public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sales amount: ");
        float sales=Float.parseFloat(in.readLine());
        test(sales);
        
    }
}