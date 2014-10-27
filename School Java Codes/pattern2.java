//To display a pattern
public class pattern2
{
public static void main(String args[])
{
int i,j,k,m;
m=20;
for(i=1;i<=20;i++)
{
for(j=1;j<=m;j++)
System.out.print(" ");
for(k=1;k<=i;k++)
System.out.print("a ");
System.out.println();
m=m-1;
}
}
}