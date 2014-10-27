//To accept a sentence from user and display the longest word and the number of characters it has.
import java.io.*;
class longword
{
    public static void main(String str[])throws IOException
    {
        String str1="";
        String str2="";
        String str3="";
        int max=0;
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence to check the longest word of:" +str1);
        str1=read.readLine();
        char ch;
        str1=str1+" ";
        int len=0;
        int x=str1.length();
        for(int i=0;i<x;i++)
        {
            ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
                len=len+1;
            }
            if(ch==' ')
            {
                if(max<=len)
                {
                    max=len;
                    str3=str2;
                }
                len=0;
                str2="";
            }
        }
        System.out.println("\nThe Longest word in your sentence is:"+str3);
        System.out.println("The size of the longest word, "+str3+" is "+max+" characters");
    }
}