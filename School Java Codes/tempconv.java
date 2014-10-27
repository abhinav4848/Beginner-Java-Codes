//User Enters temp. and is prompted to convert it to Farenheit or celsius or Kelvin by choice.
import java.io.*;
public class tempconv
{
    public static void main(String args[])throws IOException
    {
        float t;
        float cf;
        cf=0f;
        int ch;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the temp. you want to convert.(Don't mention celsius/farenheit/kelvin)");
        t=Float.valueOf(in.readLine()).floatValue();
        System.out.println("Enter 1 to convert from Celsius   to Farenheit,");
        System.out.println("Enter 2 to convert from Farenheit to Celsius,");
        System.out.println("Enter 3 to convert from Celsius   to Kelvin,");
        System.out.println("Enter 4 to convert from Kelvin    to Celsius,");
        System.out.println("Enter 5 to convert from Farenheit to Kelvin,");
        System.out.println("Enter 6 to convert from Kelvin    to Farenheit.");
        ch=Integer.parseInt(in.readLine());
        if(ch==1)
        {
            System.out.println("The Temp. in Celsius=  "+t);
            System.out.println("The Temp. in Farenheit="+(9*t/5+32));
        }
        else if(ch==2)
        {
            System.out.println("The Temp. in Farenheit="+t);
            System.out.println("The Temp. in celsius=  "+((5*t-160)/9));
        }
        else if(ch==3)
        {
            System.out.println("The Temp. in Celsius="+t);
            System.out.println("The Temp. in Kelvin= "+(t+273));
        }
        else if(ch==4)
        {
            System.out.println("The Temp. in Kelvin= "+t);
            System.out.println("The Temp. in Celsius="+(t-273));
        }
        else if(ch==5)
        {
            System.out.println("The Temp. in Farenheit="+t);
            System.out.println("The Temp. in Kelvin=   "+(((5*t-160)/9)+273));
        }
        else if(ch==6)
        {
            System.out.println("The Temp. in Kelvin=   "+t);
            System.out.println("The Temp. in Farenheit="+((5*(t-273)-160)/9));
        }
        else
        {
            System.out.println("Sorry, Thats not a valid Choice. Please choose 1, 2, 3, 4, 5, or 6.");
        }
}
}