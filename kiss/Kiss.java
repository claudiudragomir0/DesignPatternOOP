package kiss;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/*The KISS principle is descriptive to keep the code simple and clear, making it easy to understand.
— computers can only understand 0 and 1 — so keep coding simple and straightforward.
 Keep your methods small. Each method should never be more than 40-50 lines.

Each method should only solve one small problem, not many use cases. If you have a lot of conditions in the method, break these out into smaller methods. It will not only be easier to read and maintain, but it can help find bugs a lot faster.*/
public class Kiss {
    public static void main(String[] args) {
        try {
            System.out.println(getWeekDayOne(1));
            //System.out.println(getWeekDayTwo(1));
            //System.out.println(getWeekDayThree(1));
            //System.out.println(getWeekDayFour(1));
            //System.out.println(getWeekDayFive(1));
            //System.out.println(getWeekDaySix(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getWeekDayOne(int day) throws Exception {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                throw new Exception("day must be in range 1 to 7");
        }
        return dayName;
    }

    public static String getWeekDayTwo(int day) throws Exception {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new Exception("day must be in range 1 to 7");
        }
    }

    public static String getWeekDayThree(int day) throws Exception {
        if ((day < 1) || (day > 7)) throw new Exception("day must be in range 1 to 7");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[day - 1];
    }

    public static String getWeekDayFour(int day) {
        return DateTimeFormatter.ofPattern("EEEE", Locale.US).format(DayOfWeek.of(day));
    }

    public static String getWeekDayFive(int day) {
        return DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.US);
    }

    public static String getWeekDaySix(int day) {
        return DayOfWeek.of(day).name();
        //return of(day).name();
    }

    //Overloaded Methods?
}