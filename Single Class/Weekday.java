//Program 9.8
import java.io.*;
public class Weekday
{
    public static void weekday(int dow)
    {
        String ans;
        switch(dow)
        {
            case 1:
                ans="Sunday";
                break;
            case 2:
                ans="Monday";
                break;
            case 3:
                ans="Tuesday";
                break;
            case 4:
                ans="Wednesday";
                break;
            case 5:
                ans="Thursday";
                break;
            case 6:
                ans="Friday";
                break;
            case 7:
                ans="Saturday";
                break;
            default:
                ans="Wrong Day Number";
       }
       System.out.println(ans);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sales amount: ");
        int dow=Integer.parseInt(in.readLine());
        weekday(dow);
    }
}