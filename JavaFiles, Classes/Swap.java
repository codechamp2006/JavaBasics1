
/**
 * Write a description of class Swap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Swap
{
    public static void main(int a, int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + "b= " + b);
    }
}
