//To Find the Largest Number out of 3 input Numbers
//prog 9.1
public class LargestNumber
{
    public static void test(int x, int y, int z)
    {
        int max=0;
        max=x;
        if(y>max)
            max=y;
        if(z>max)
            max=z;
        System.out.println("Largest number is "+max);
    }
}