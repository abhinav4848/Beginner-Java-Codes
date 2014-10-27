/*to find the factorial of 10 using do-while statement. i.e.the product of all the numbers up till 10.(10*9*8*7*6*5*4*3*2*1)*/
public class factorial
{
public static void main(String args[])
{
int i,f;i=1;f=1;
do
{
f=f*i;
i++;
}
while(i<=10);
System.out.println("The Factorial of 10="+f);
System.out.println("10*9*8*7*6*5*4*3*2*1");
}
}