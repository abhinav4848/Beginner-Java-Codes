/*Program checks if the given no. is even or odd Entry via Command Line Argument. User must enter the number right after typing "java cmdeven_odd<space><number> eg:"java cmdeven_odd 12"*/
public class cmdeven_odd
{
public static void main(String args[])
{
int n;
n=Integer.parseInt(args[0]);
if (n%2==0)
System.out.println(n+" is an even number.");
else
System.out.println(n+" is an odd number.");
}
}