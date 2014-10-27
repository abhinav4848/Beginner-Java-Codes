//To copy the value of one object area into aother object area through copy constructor.
class copy
{
public int m;
public copy(int x)
{
m=x;
}
public copy(copy p)
{
m=p.m;
}
public void show()
{
System.out.println("m="+m);
}
}
class Copymain
{
public static void main(String args[])
{
copy obj1=new copy(20);
copy obj2=new copy(obj1);
obj1.show();
obj2.show();
}
}
