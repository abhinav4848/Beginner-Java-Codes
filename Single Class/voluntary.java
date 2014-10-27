import java.io.*;
public class voluntary
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i=4,j=1,c=0;
String m="yes";
while(m.equals("yes"))
{
c=i*j;
System.out.println(c);
j++;
System.out.println("Want to Continue?...(Yes/No)");
m=in.readLine();
}
System.out.println("choice is wrong");
}
}