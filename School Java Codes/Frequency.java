//To check the frequency of a word entered by user in a string entered by the user.
import java.io.*;
public class Frequency
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int x,z,f=0;
        String str,str1,t="";
        char p;
        System.out.println("Enter a string");
        str=in.readLine();
        System.out.println("Enter a word to check the frequency of, in the string");
        str1=in.readLine();
        str=str+"";
        x=str.length();
        for(z=0;z<x;z++)
        {
            p=str.charAt(z);
            if(p!=' ')
            t=t+p;
            else
            {
                if(t.compareTo(str1)==0)
                f=f+1;
                t="";
            }
        }
        System.out.println("The frequency of "+str1+" in the given string is:"+f);
    }
}