
/**
 * Write a description of class SunnyNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SunnyNumber
{
   public static void main(int num)
   {
       num = num + 1;
       int a = (int) Math.sqrt(num);
       if (a * a == num)
       System.out.println("Sunny");
       else
       System.out.println("Not sunny");
    }
}
