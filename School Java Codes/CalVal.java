//Program 5.2
public class CalVal
{
    public void CalValTest()
    {
    int orig = 10;
    System.out.println("The original value is " + orig);
    System.out.println("Return value of function change() is " + change(orig));
    System.out.println("The value after function change() is over " + orig);
    }

    public static int change(int a)
    {
        a =20;
        return a;
    }
}
