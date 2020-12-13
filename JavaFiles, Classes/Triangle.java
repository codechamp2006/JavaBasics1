
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
     public static void main (int a, int b, int c)
     {
         if (a==b && b==c && a==c)
         System.out.print("Equilateral");
         else if (a==b || b==c || a==c)
         System.out.print("Isosceles");
         else 
         System.out.print("Scalene");
     }
}
