/*To check whether a word is palindrome or not. (If the word spelt backward is the same as the word spelt the right way. eg:Naman*/
import java.io.*;
public class palindrome
{
public static void main(String args[])throws IOException
{
BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
String word1="";
String word2="";
int x,y;
char a;
System.out.println("Input a word to check if it is Palindrome:");
word1=bobj.readLine();
y=word1.length();
for(x=y-1;x>=0;x--)
{
word2=word2+word1.charAt(x);
}
if(word1.equals(word2))
{
System.out.println("The word: "+word1+" is Palindrome.");
}
else
{
System.out.println("The word: "+word1+" is not a Palindrome.");
}
}
}