//It finds the Middle term Breakup value of x via Sri- DharAcharya Method.
import java.io.*;
class Middleterm
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter the First value:");
        a=Integer.parseInt(read.readLine());
        System.out.println("Enter the Middle value:");
        b=Integer.parseInt(read.readLine());
        System.out.println("Enter the Third value:");
        c=Integer.parseInt(read.readLine());
        double d=Math.sqrt((b*b)-(4*a*c));
        double ansplus=((b*-1)+d)/(2*a);
        double ansmins=((b*-1)-d)/(2*a);
        System.out.println("The Middle Term is:");
        System.out.println("x= "+ansplus);
        System.out.println("x= "+ansmins);
    }
}