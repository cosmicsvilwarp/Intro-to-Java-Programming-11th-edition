/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		// Create a GregorianCalendar object
				GregorianCalendar calender = new GregorianCalendar();
				
				// Display the current year, month, and day in format Mth/Day/Year
				System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
				System.out.println(calender.get(calender.MONTH) + "/" +
					calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

				// Set elapsed time since January 1, 1970 to 1234567898765L
				calender.setTimeInMillis(561555550000L);
				// Display the year, month and day
				System.out.print("\nElapsed time since January 1, 1970 set to " +
					"1234567898765L in format Mth/Day/Year: ");
				System.out.println(calender.get(calender.MONTH) + "/" +
					calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
				
			}
		}