
/**
 * Write a description of class BuzzNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BuzzNumber
{
    public static void main(int num) 
    {
        if (num % 10 ==7 || num % 7 == 0)
        System.out.println("Buzz");
        else
        System.out.println("Not buzz");
    }
}
