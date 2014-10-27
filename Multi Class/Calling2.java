/*Creating own class and calling its contents to another using object making and not static.Input and processing only done in the first calss. It makes 2 Class files. The first with name B*/
class B
{
int a,b,c;
public int f()
{
a=10;/*Input*/
System.out.println(" a="+a+".");/*Output*/
b=20;/*Input*/
System.out.println(" b="+b+".");/*Output*/
c=a+b;/*Processing*/
System.out.println("The sum="+c);/*Output*/
return(c);
}
}
class Calling2
{
public static void main(String args[])
{
int x;
B m=new B();
x=m.f();
System.out.println("The sum="+x);/*Output*/
}
}
