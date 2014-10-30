
/**
 * Enter 105 and output is One Hundred Five. Replica of "FunStuff"
 * 
 * @author (Abhinav Kumar) 
 * @version (0.1)
 */

import java.io.*;
public class numberToName
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a whole Number upto 9 digits");
        String name=ak.readLine();
        FindName(name);
    }
    public static void FindName(String name)
    {
        int i,d;
        int len=name.length();
        int m[]=new int[len];
        String ans[]=new String[len];
        System.out.println("Name:"+name);
        name=name.toLowerCase();
        for(i=0; i<len; i++)
        {
            m[i]=name.charAt(i);
        }
        for(i=0; i<len; i++)
        {
            switch(m[i])
            {
                case ' ':
                    ans[i]=" ";
                    break;
                case '1':
                    ans[i]="One";
                    break;
               case '2':
                    ans[i]="Two";
                    break;
               case '3':
                    ans[i]="Three";
                    break;
               case '4':
                    ans[i]="Four";
                    break;
               case '5':
                    ans[i]="Five";
                    break;
               case '6':
                    ans[i]="Six";
                    break;
               case '7':
                    ans[i]="Seven";
                    break;
               case '8':
                    ans[i]="Eight";
                    break;
               case '9':
                    ans[i]="Nine";
                    break;
               case '0':
                    ans[i]="Zero";
                    break;
                }
          }
           for(i=0; i<len; i++)
        {
                System.out.println(ans[i]);
        }
    }
}
  