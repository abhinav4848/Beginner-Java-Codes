//To convert an input Temp.
//program 9.2
import java.io.*;
public class ConvertTemp
{
    public static void fahToCelsius(float tempF)
    {
        float tempC=(9*tempF/5+32);
        System.out.println("Temperature in Celsius is "+tempC);
    }
    public static void ceToFarenheit(float tempC)
    {
        float tempF=(tempC*1.8F)+32;
        System.out.println("Temperature in Farenheit is "+tempF);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Farenheit to Celsius");
        System.out.println("2. Celsius to Farenheit");
        System.out.println("Enter your choice");
        int ch=Integer.parseInt(in.readLine());
        if(ch==1||ch==2)
        {
            System.out.println("Enter the Temp. to convert: ");
            float temp=Float.parseFloat(in.readLine());
            if(ch==1)
            System.out.println(temp+" degree Frenheit is "+((5*temp-160)/9)+" Celsius.");
            else if (ch==2)
            System.out.println(temp+" degree Celsius is "+(9*temp/5+32)+" Farenheit.");
        }
        else
             System.out.println(" You Entered "+ch+" which is Invalid option.");
    }
}
