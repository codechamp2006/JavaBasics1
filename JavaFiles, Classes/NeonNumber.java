
/**
 * Write a description of class NeonNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NeonNumber
{
    public static void main (int num)
    {
        int sqnum = num * num;
        int d1 = sqnum/10; 
        int d2 = sqnum%10;
        if ((d1 + d2) == num)
        System.out.println("Neon");
        else 
        System.out.println("Not neon");
    }
}
