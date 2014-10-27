/*To find Amount and Simple Interest using assignment statement. Nos. Mentioned in the program.*/
public class compound
{
public static void main(String args[])
{
int p,r,t;
float r1;
double ci,amt;
p=5000;r=10;t=2;
r1=(1+r/100f);
ci=Math.round(p*Math.pow(r1,t));
System.out.println("The Compound Interest is="+ci);
amt=ci-p;
System.out.println("The Amount is="+amt);
}
}