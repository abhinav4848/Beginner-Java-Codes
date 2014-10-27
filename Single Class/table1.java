/*Table of nos. via method overloading. Modifeid version of "Table" where user sees only the table of a number he/she wants to see.*/
import java.io.*;
class table1
{
    public static void main(String args[])throws IOException
    {
        char ch='Y';
        int n,t;
        BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
        while((ch=='y')||(ch=='Y'))
        {
            System.out.println("Enter Any Number to see the table of:");
            n=Integer.parseInt(bobj.readLine());
            for(int a=1;a<=12;a++)
            {
                t=n*a;
                System.out.println(n+"*"+a+"="+t);
            }
            System.out.println("Continue?...(Y/N):");
            ch=(bobj.readLine()).charAt(0);
            //if(ch=='n'||ch=='N')
            //{
            //    break;
            //}
        }
    }
}