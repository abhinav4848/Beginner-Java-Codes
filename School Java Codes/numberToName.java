
/**
 * Enter 105 and output is One Hundred Five.
 * 
 * @author (Abhinav Kumar) 
 * @version (0.1)
 */

import java.io.*;
public class numberToName
{
public static void main(String args[])throws IOException
{
  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter a whole Number upto 9 digits");
  String c="Hi";
  int a=Integer.parseInt(read.readLine());
  int b=c.length();
  System.out.println(b);
}
}
  