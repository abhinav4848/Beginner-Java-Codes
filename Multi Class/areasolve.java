import java.util.*;
class solve
{
private int ar;
public void area(int l)
{
ar=l*l;
System.out.println("Area of Square="+ar);
}
public void area(int l1, int b1)
{
ar=l1*b1;
System.out.println("Area of Rectangle="+ar);
}
}
class areasolve
{
public static void main(String args[])
{
int l,b;
Scanner sobj=new Scanner(System.in);
System.out.println("Enter Length:");
l=sobj.nextInt();
System.out.println("Enter breadth:");
b=sobj.nextInt();
solve s1=new solve();
s1.area(l);
s1.area(l,b);
}
}