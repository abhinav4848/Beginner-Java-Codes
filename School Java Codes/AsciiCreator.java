//To find Ascii VAlue's corresponding number.
import java.io.*;
public class AsciiCreator
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ascii Value \t    Character.");
        for(int i=33; i<=70; i++)
        {
            char ch=(char)i;
            System.out.println(i+"\t\t\t"+ch);
        }
        System.out.println("Do you want to carry on?");
        char ch1=ak.readLine().charAt(0);
        if (ch1=='y' || ch1=='Y')
        {
            System.out.println("Ascii Value \t    Character.");
            for(int i=71; i<=110; i++)
            {
                char ch=(char)i;
                System.out.println(i+"\t\t\t"+ch);
            }
            System.out.println("Do you want to carry on?");
            ch1=ak.readLine().charAt(0);
            if (ch1=='y' || ch1=='Y')
            {
                System.out.println("Ascii Value \t    Character.");
                for(int i=111; i<=127; i++)
                {
                    char ch=(char)i;
                    System.out.println(i+"\t\t\t"+ch);
                }
            }
        }
    }
}