
/**
 * Write a description of class TwoDigitSpecialNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDigitSpecialNumber
{
    public static void main(int num)
    {
        int d1, d2 , newnum = 0;
        d1 = num % 10;
        d2 = num / 10;
        newnum = d1 + d2 + num;
        if ((d1 * 10 + d2) == newnum)
        System.out.println("Special Two Digit");
        else
        System.out.println("Not");
    }
}
