//Write your name and it will covert each letter to word.
import java.io.*;
public class NameToVulgarMeaning
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader ak=new BufferedReader(in);
        System.out.println("...Welcome to Name Vulgar Meaning Finder.....");
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
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Ass";
                    if(d==1)
                        ans[i]="Asshole";
                    if(d==2)
                        ans[i]="Asparagus";
                    break;
                case 'b':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Bad";
                    if(d==1)
                        ans[i]="Bitch";
                    if(d==2)
                        ans[i]="Bastard";
                    break;
                case 'c':
                    d=(int)(Math.random()*5);
                    if(d==0)
                        ans[i]="Cunt";
                    if(d==1)
                        ans[i]="Chutiya";
                    if(d==2)
                        ans[i]="Cheap";
                    if(d==3)
                        ans[i]="Careless";
                    if(d==4)
                        ans[i]="Cow";
                    break;
                case 'd':
                    d=(int)(Math.random()*2);
                    if(d==0)
                        ans[i]="Dick";
                    if(d==1)
                        ans[i]="Dickhead";
                    break;
                case 'e':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Egghead";
                    if(d==1)
                        ans[i]="Eccentric";
                    if(d==2)
                        ans[i]="Egotastical";
                    break;
                case 'f':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Fucker";
                    if(d==1)
                        ans[i]="Faggot";
                    if(d==2)
                        ans[i]="Fucktard";
                    break;
                case 'g':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Goat";
                    if(d==1)
                        ans[i]="Gay";
                    if(d==2)
                        ans[i]="Gore Lover";
                    break;
                case 'h':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Horny";
                    if(d==1)
                        ans[i]="Hitler";
                    if(d==2)
                        ans[i]="Hag";
                    break;
                case 'i':
                    d=(int)(Math.random()*2);
                    if(d==0)
                        ans[i]="Idiot";
                    if(d==1)
                        ans[i]="Instawhore";
                    break;
                case 'j':
                    ans[i]="Jackass";
                    break;
                case 'k':
                    ans[i]="Klutz";
                    break;
                case 'l':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Lard";
                    if(d==1)
                        ans[i]="Lunch money";
                    if(d==2)
                        ans[i]="Lesbian";
                    break;
                case 'm':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Matha-effer";
                    if(d==1)
                        ans[i]="Moron";
                    if(d==2)
                        ans[i]="Masturbator";
                    break;
                case 'n':
                    ans[i]="Nutcase";
                    break;
                case 'o':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Otter";
                    if(d==1)
                        ans[i]="Onion";
                    if(d==2)
                        ans[i]="O-Hole";
                    break;
                case 'p':
                    d=(int)(Math.random()*2);
                    if(d==0)
                        ans[i]="Pussy";
                    if(d==1)
                        ans[i]="Prostitute";
                    break;
                case 'q':
                    ans[i]="Seriously??? Your name has a 'Q' in it?? Fok'Q'";
                    break;
                case 'r':
                    d=(int)(Math.random()*3);
                    if(d==0)
                        ans[i]="Retard";
                    if(d==1)
                        ans[i]="Rascal";
                    if(d==2)
                        ans[i]="Racist";
                    break;
                case 's':
                    d=(int)(Math.random()*4);
                    if(d==0)
                        ans[i]="Sucker";
                    if(d==1)
                        ans[i]="Son of a Beach";
                    if(d==2)
                        ans[i]="stupid";
                    if(d==3)
                        ans[i]="stupid";
                    break;
                case 't':
                    ans[i]="Titty";
                    break;
                case 'u':
                    ans[i]="Unbearable";
                    break;
                case 'v':
                    ans[i]="Vagabond";
                    break;
                case 'w':
                    ans[i]="Whore";
                    break;
                case 'x':
                    ans[i]="X-Rated Movie Maker";
                    break;
                case 'y':
                     d=(int)(Math.random()*2);
                    if(d==0)
                        ans[i]="Yucky";
                    if(d==1)
                        ans[i]="Yitturbium... aka Nerd!";
                    break;
                case 'z':
                    ans[i]="Zoroastrian";
                    break;
                default:
                    ans[i]=(char)m[i]+": Unknown";
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