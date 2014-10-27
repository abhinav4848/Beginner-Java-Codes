/*Creating own class and calling its contents to another using object making and not static. Only Processing done in the first class itself. It makes 2 Class files. The first with name D*/
class D1
{
int a,b,c;
public int f(int a, int b)
{
c=a+b;/*Processing*/
return(c);
}
}
class Calling41
{
int x,y,z;
public static void main(String args[])
{
Calling41 n=new Calling41();
n.x=10;/*Input*/
n.y=20;/*Input*/
D m=new D();
n.z=m.f(n.x,n.y);
System.out.println("The Sum="+n.z);/*Output*/
}
}