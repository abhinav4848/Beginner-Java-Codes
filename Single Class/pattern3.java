//To Display a pattern of words entered by User's Choice
import java.io.*;
public class pattern3
{
public static void main(String args[])throws IOException
{
BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
String x;
int a,y;
System.out.println("Enter your word for the pattern printing");
x=in.readLine();
x=" "+x;
y=x.length();
System.out.println("The original word you entered was:"+x);
for(a=0;a<=y;a++)                        //The 0 should be matching with the next line's 
System.out.println(x.substring(0,a));    //0, or up one's no. should greater than lower's.
}
}