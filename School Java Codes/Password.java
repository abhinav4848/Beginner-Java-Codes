//A program that leaks your girlfriend's phone number after you succeed in the password test in 3 chances.
//To use it more effectively, save more thing in the mentioned line and compile and then hide the source code.
import java.io.*;
public class Password
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader ak=new BufferedReader(in);
        String name1="abhinav";//First step for password check
        String age1="17";//Second step for password check
        String num1="12345";//Third Step for password check
        int finalval=0;
        char ch='y';
        int chance=1;
        while((chance<=3)&&((ch=='y')||(ch=='Y')))
        {
            if(chance>1)
            {
                System.out.println("Chance "+chance);
                System.out.println("**********");
            }
            chance++;
            System.out.println("...Password required.....");
            System.out.println("Step 1:");
            System.out.println("Type Your Name:");
            String name=ak.readLine();
            name=name.toLowerCase();
            if(name.compareTo(name1)==0)
            {
                System.out.println("Step 2:");
                System.out.println("Type Your Age:");
                String age=ak.readLine();
                if(age.compareTo(age1)==0)
                {
                    System.out.println("Step 3:");
                    System.out.println("Type Your Unique Number:");
                    String num=ak.readLine();
                    if(num.compareTo(num1)==0)
                    {
                        finalval++;
                    }
                    else
                    {
                        System.out.println("Final Step Wrong....Terminating..");
                    }
                }
                else
                {
                    System.out.println("Second Step Wrong....Terminating..");
                }
            }
            else
            {
                System.out.println("First Step Wrong....Terminating..");
            }
            if(finalval==1)
            {
                System.out.println("Her Phone Number is 9912576984");//Add all details to be known after getting to the right passwords, here.
                System.out.println("----------------");
                ch='n';
            }
            else
            {
                System.out.println("You Failed in password test.");
                if(chance<4)
                {
                    System.out.println("Retry?...(Y/N):");
                    ch=ak.readLine().charAt(0);
                    System.out.println("----------------");
                    System.out.println();
                }
                else
                {
                    System.out.println("You already used 3 chances... Terminating...");
                    System.out.println("----------------");
                }
            }
        }
    }
}