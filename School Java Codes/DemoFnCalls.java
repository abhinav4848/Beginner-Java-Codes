//Program 5.3
public class DemoFnCalls
{

    public static int x =10;
    public static int y =20;
    
    public static void DemoTest()
    {
        System.out.println("Values initially. x =" + x + ", y =" + y);
        swapCallByValue(x,y);
        System.out.println("Values after swapCallByValue function. x =" + x + " ,y =" + y);
        DemoFnCalls object1 = new DemoFnCalls();    // an object created
        swapCallByRef(object1);
        System.out.println("Values after swapCallByRef function. x =" + x + " ,y =" + y);
    }

    public static void swapCallByValue(int a,int b)
    {
        int tmp;
        tmp =a;
        a=b;
        b=tmp;
        System.out.println("Values inside swapCallByValue function. x =" + a + " ,y =" +b);
    }

    public static void swapCallByRef(DemoFnCalls obj)
    {
        int tmp;
        tmp =obj.x;
        obj.x=obj.y;
        obj.y=tmp;
        System.out.println("Values inside swapCallByRef function. x =" + obj.x + " ,y =" + obj.y);
    }


}
