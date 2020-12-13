
/**
 * Write a description of class ParcelCost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParcelCost
{
    public static void main(int weight)
    {
        int charge = 0;
        if (weight <= 500)
        charge = 40;
        else if (weight/100 == 0)
        charge = 40 + (weight - 500)/100 * 20;
        else 
        charge = 40 + (weight - 500)/100 * 20 + 20;
        
        System.out.println("Charge = " + charge);
    }
}
