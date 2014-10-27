//to accept a string and reverse the characters of all the words and display their output.
import java.io.*;
public class revchar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int x,y,z;
        String m,p,name;name="";m="";p="";
        char b;b=0;
        System.out.println("Enter the string:");
        name=in.readLine();
        name=name+" ";
        x=name.length();
        for(y=0;y<x;y++)
        {
            b=(name.charAt(y));
            if(b==' ')
            {
                p=p+" "+m;
                m="";
            }
            else
            m=b+m;
        }
        System.out.println("The string written in the reverse order is:");
        System.out.println(p);
    }
}