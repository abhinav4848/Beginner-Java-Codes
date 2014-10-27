/*Creating own class and calling its contents to another using object making and not static. Processing and Output done in the first class itself. It makes 2 Class files. The first with name C*/
class C
{
int a,b;
float c;
public void f(int a, float b)
{
System.out.println("a="+a);/*Output*/
System.out.println("b="+b);/*Output*/
c=a+b;/*Processing*/
System.out.println("The Sum="+c);/*Output*/
}
}
class Calling3
{
public static void main(String args[])
{
int x;
float y;
x=10;/*Input*/
y=20f;/*Input*/
C m=new C();
m.f(x,y);
}
}