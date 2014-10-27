//program 9.9
//To find area of a circle, rectangle or triangle depending on user choice.
import java.io.*;
public class CircleArea
{
    public static void circleArea(float r)
    {
        double area=3.14*r*r;
        System.out.println("Circle's area is "+area);
    }
    public static void rectangleArea(float l, float b)
    {
        double area=l*b;
        System.out.println("Rectangle's area is "+area);
    }
    public static void triangleArea(float a, float b, float c)
    {
        double s,area;
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Triangle's area is "+area);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for Circle.");
        System.out.println("Enter 2 for Rectangle.");
        System.out.println("Enter 3 for Triangle.");
        System.out.println("Enter the number of What you want to find the area of:");
        int ch=Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
                System.out.println("-----Circle-----");
                System.out.println("Enter the Radius:");
                    float r=Float.parseFloat(in.readLine());
                circleArea(r);
                break;
            case 2:
                System.out.println("----Rectangle----");
                System.out.println("Enter the Length:");
                    float len=Float.parseFloat(in.readLine());
                System.out.println("Enter the Breadth:");
                    float bre=Float.parseFloat(in.readLine());
                rectangleArea(len,bre);
                break;
            case 3:
                System.out.println("------------Triangle-----------");
                System.out.println("Enter the Length of First Side:");
                    float a=Float.parseFloat(in.readLine());
                System.out.println("Enter the Length of Second Side:");
                    float b=Float.parseFloat(in.readLine());
                System.out.println("Enter the Length of Third Side:");
                    float c=Float.parseFloat(in.readLine());
                if((a+b>c)&&(a+c>b)&&(b+c>a))
                {
                    triangleArea(a,b,c);
                }
                else
                {
                    System.out.println("The Triangle cannot have sum of 2 sides smaller than 3rd side.");
                }
                break;
            default:
                System.out.println("Wrong Choice Bob....");
       }
}
}