
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grade
{
    public static void main (int marks)
    {
        if (marks >= 80)
        System.out.print("Grade A");
        else if (marks >=60 && marks < 80)
        System.out.print("Grade B");
        else if (marks >= 40 && marks < 60)
        System.out.print("Grade C");
        else 
        System.out.print("Grade D");
    }
}
