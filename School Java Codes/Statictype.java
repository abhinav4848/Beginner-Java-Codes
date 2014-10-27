/*Use of static keyword to call a value from one calss to another.Creating a class and function according to our choice and use it in the main calss.*/
class A
{
static int x;
int y;
public void f1()
{
y=10;
System.out.println("y="+y);
}
}
class Statictype
{
public static void main(String args[])
{
A.x=10;
System.out.println("x="+A.x);
A obj1=new A();
obj1.x=20;
obj1.f1();
System.out.print(obj1.x);
}
}