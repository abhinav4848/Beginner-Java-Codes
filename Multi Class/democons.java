//Program to demonstrate the default and parameterised constructors.
class dp
{
public dp()
{
System.out.println("Default Constructor");
}
public dp(int a)
{
System.out.println("a="+a);
System.out.println("Parameterised Constructor");
}
public dp(float b)
{
System.out.println("b="+b);
System.out.println("Parameterised Constructor");
}
}
class democons
{
public static void main(String args[])
{
dp d1=new dp(20);
dp d2=new dp();
dp d3=new dp(4);
}
}