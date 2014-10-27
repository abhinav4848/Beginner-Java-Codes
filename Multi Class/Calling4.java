/*Creating own class and calling its contents to another using object making and not static. Only Processing done in the first class itself. It makes 2 Class files. The first with name D*/
class D
{
int a,b,c;
public int f(int a, int b)
{
c=a+b;/*Processing*/
return(c);
}
}
class Calling4
{
static int x,y,z;
public static void main(String args[])
{
x=10;/*Input*/
y=20;/*Input*/
D m=new D();
z=m.f(x,y);
System.out.println("The Sum="+z);/*Output*/
}
}