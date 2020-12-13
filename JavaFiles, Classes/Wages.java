
/**
 * Write a description of class Wages here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wages
{
    public static void main(int hr, int k)
    {
        double wage = 0;
        if (hr<=40)
        wage = k*hr;
        else if (hr<=50)
        wage = 40*k+(hr-40)*k*1.5;
        else 
        wage = 40*k+10*1.5+ (hr-50)*k*2;
        System.out.println("wage = " + wage);
    }
}
