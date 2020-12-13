
/**
 * Write a description of class Output1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Output1
{
    public static void main()
    {
        int a=-4,b=8,c=-13;
        a=a%b+b%c+c%a;
        c+= a+b;
        System.out.println(a%c+c%b);
    }
}
