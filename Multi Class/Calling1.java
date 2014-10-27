/*Creating own class and calling its contents to another using object making and not static. Input, Output and processing done in the first class itself. It makes 2 Class files. The first with name A*/
class A
{
int a,b,c;
public void f()
{
a=10;/*Input*/
b=20;/*Input*/
c=a+b;/*Processing*/
System.out.println("a="+a);/*Output*/
System.out.println("b="+b);/*Output*/
System.out.println("Sum of a+b="+c);/*Output*/
}
}
class Calling1
{
public static void main(String args[])
{
A m=new A();/*Calling the previous function by making object*/
m.f();
}
}