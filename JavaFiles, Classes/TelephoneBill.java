
/**
 * Write a description of class TelephoneBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TelephoneBill
{
   public static void main(int call)
   {
       double bill = 0;
       call = call - 50;
       if (call <= 100)
       bill = call * 2;
       else if (call <= 200)
       bill = 100 * 2 + (call - 100) * 2.5;
       else
       bill = 100 * 2 + 100 * 2.5 + (call - 200) * 3;
       
       bill = bill + 100;
       bill = bill + (10.12/100) * bill;
       
       System.out.println("Bill amount = " + bill);
   }
}
