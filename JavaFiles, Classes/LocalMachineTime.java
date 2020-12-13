import java.time.*; // importing all the java.time modules
import java.time.temporal.*; // importing all the java.time.temporal modules
import java.util.*; // importing all the java utilities modules

public class LocalMachineTime 
{
    public static void main(String [] arguments)
    {
        // collecting user information
        String username;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your name: ");
        username = user.nextLine();
        
        // creating a LocalDateTime variable and an object 
        LocalDateTime now = LocalDateTime.now();
        
        // initializing and assigning current time values
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int min = now.get(ChronoField.MINUTE_OF_HOUR);
        int sec = now.get(ChronoField.SECOND_OF_MINUTE);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        // printing the date and time 
        System.out.println("Date:" + day + "/" + month + "/" + year);
        System.out.println("Time: " + hour + ":" + min + ":" + sec);
        
        // choosing messages to greet the user 
        // running several conditions 
        if (hour >=24 && hour < 3)
        {
            System.out.println("It's late night now, " + username);
        }
        else if (hour >= 3 && hour <6)
        {
            System.out.println("It's early morning now, " + username);
        }
        else if (hour >= 6 && hour < 12)
        {
            System.out.println("Good morning, " + username);
        }
        else if (hour == 12)
        {
            System.out.println("Good noon, " + username);
        }
        else if (hour >= 12 && hour < 17)
        {
            System.out.println("Good afternoon, " + username);
        }
        else if (hour >=19 && hour < 21)
        {
            System.out.println("Good evening, " + username);
        }
        else if (hour >= 21 && hour < 24)
        {
            System.out.println("Good night, " + username);
        }
        else 
        {
            System.out.println("Sorry, there was an error! Please try again.");
        }
    }
}
