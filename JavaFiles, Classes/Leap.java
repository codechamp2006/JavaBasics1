
/**
 * Write a description of class Leap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Leap
{
    public static void main(int year)
    {
        if (year % 400 == 0 || (year % 100!=0 && year % 4 == 0))
        {
            System.out.println("Leap year");
        }
        else 
        System.out.println("Not a leap year");
    }
}
