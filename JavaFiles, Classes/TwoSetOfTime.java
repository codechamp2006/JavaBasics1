
/**
 * Write a description of class TwoSetOfTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoSetOfTime
{
    public static void main (int hr1, int min1, int sec1, int hr2, int min2, int sec2)
    {
        // initialization of three variables 
        int result; 
        int finalhr;
        int finalmin;
        // converting the first set of time to seconds
        hr1 = hr1* 3600;
        min1 = min1 * 60;
        sec1 = hr1 + min1 + sec1;
        // converting the second set of time to seconds
        hr2 = hr2 * 3600;
        min2 = min2 * 60;
        sec2 = hr2 + min2 + sec2;
        // adding both sets of time 
        result = sec1 + sec2;
        // converting the result into hr,min,sec
        finalhr = result / 3600;
        result = result % 3600;
        finalmin = result / 60;
        result = result % 60;
        // printing the results 
        System.out.println(finalhr + " : " + finalmin + " : " + result);
    } // end of method
} // end of class
