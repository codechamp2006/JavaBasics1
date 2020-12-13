
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    public static void main(int sec)
    {
        int hr,min;
        hr = sec/3600 ;
        sec = sec % 3600 ;
        min = sec/60 ;
        sec = sec % 60 ;
        System.out.println (hr + " " + min + " " + sec);
} // end of display
} // end of class 
