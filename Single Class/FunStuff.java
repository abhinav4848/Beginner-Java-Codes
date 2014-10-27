//No Idea what i'm making.
import java.io.*;
public class FunStuff
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader ak=new BufferedReader(in);
        System.out.println("...Welcome to Name Meaning Finder.....");
        System.out.println("Type Your Name:");
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
                case 'a':
                    d=(int)(Math.random()*4);
                    if(d==0)
                        ans[i]="Active";
                    if(d==1)
                        ans[i]="Adventurous";
                    if(d==2)
                        ans[i]="Authentic";
                    if(d==3)
                        ans[i]="Awesome";
                    break;
                case 'b':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Beautiful";
                    if(d==1)
                        ans[i]="Bold";
                    if(d==2)
                        ans[i]="Brave";
                    break;
                case 'c':
                    d=(int)(Math.random()*5);
                    if(d==0)
                        ans[i]="Capable";
                    if(d==1)
                        ans[i]="Caring";
                    if(d==2)
                        ans[i]="Confident";
                    if(d==3)
                        ans[i]="Curious";
                    if(d==4)
                        ans[i]="Courageous";
                    break;
                case 'd':
                    ans[i]="Dependable";
                    break;
                case 'e':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Exceptional";
                    if(d==1)
                        ans[i]="Energetic";
                    if(d==2)
                        ans[i]="Enthusiastic";
                    break;
                case 'f':
                    ans[i]="Friendly";
                    break;
                case 'g':
                    ans[i]="Gorgeous";
                    break;
                case 'h':
                    ans[i]="Hardworking";
                    break;
                case 'i':
                    d=(int)(Math.random()*4);
                    if(d==0)
                        ans[i]="Interesting";
                    if(d==1)
                        ans[i]="Imaginative";
                    if(d==2)
                        ans[i]="Intelligent";
                    if(d==3)
                        ans[i]="Important";
                    break;
                case 'j':
                    ans[i]="Joyful";
                    break;
                case 'k':
                    ans[i]="Kind";
                    break;
                case 'l':
                    ans[i]="Lovable";
                    break;
                case 'm':
                    ans[i]="Magical";
                    break;
                case 'n':
                    ans[i]="Natural";
                    break;
                case 'o':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Open Minded";
                    if(d==1)
                        ans[i]="Original";
                    if(d==2)
                        ans[i]="Optimistic";
                    break;
                case 'p':
                    ans[i]="Positive";
                    break;
                case 'q':
                    ans[i]="Quinky";
                    break;
                case 'r':
                    ans[i]="Reliable";
                    break;
                case 's':
                    ans[i]="Sweet";
                    break;
                case 't':
                    ans[i]="Thoughtful";
                    break;
                case 'u':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Unselfish";
                    if(d==1)
                        ans[i]="Upbeat";
                    if(d==2)
                        ans[i]="Unforgettable";
                    break;
                case 'v':
                    ans[i]="Valuable";
                    break;
                case 'w':
                    ans[i]="Wonderful";
                    break;
                case 'x':
                    ans[i]="Xceptional";
                    break;
                case 'y':
                    ans[i]="Young";
                    break;
                case 'z':
                    ans[i]="Zoroastrian";
                    break;
                default:
                    ans[i]="Unknown";
                    break;
            }
        }
        for(i=0; i<len; i++)
        {
                System.out.println(ans[i]);
        }
    }
}
//This program finds the meaning of each letter of your name.