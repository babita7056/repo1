//11.Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). 
//For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
package Level3Practice;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter year (e.g., 2023): ");
        int y = scanner.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100; // The year within the century
        int j = y / 100; // The zero-based century

        int f = d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int dayOfWeek = f % 7;

        // Adjusting to make Sunday=0, Monday=1, ..., Saturday=6
        dayOfWeek = (dayOfWeek + 5) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The day of the week is: " + days[dayOfWeek]);
    }
}
