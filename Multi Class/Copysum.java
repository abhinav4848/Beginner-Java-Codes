//To add the value of two objects area through copy constructor.
class sum
{
private int m;
public sum(int x)
{
m=x;
}
public sum(sum p1,sum p2)
{
m=p1.m+p2.m;
}
public void show()
{
System.out.println("m="+m);
}
}
class Copysum
{
public static void main(String args[])
{
sum s1=new sum(10);
sum s2=new sum(20);
sum s3=new sum(s1,s2);
s1.show();
s2.show();
s3.show();
}
}