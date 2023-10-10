public class Utils {
    public static void checkDayAndMonthIsHoliday(int day, int month)
    {
        switch (month) {
            case  (1):
                if (day >= 1 & day <= 31)
                {
                    if (day == 1 || day == 7) System.out.println("Holiday");
                    else System.out.println("Not holiday");
                }
                else System.out.println("Day doesn't exist");
                break;
            case (2):
                if (day >= 1 & day <= 29) System.out.println("Not holiday");
                else System.out.println("Day doesn't exist");
                break;
            case (3):
                if (day >= 1 & day <= 31)
                {
                    if (day == 8) System.out.println("Holiday");
                    else System.out.println("Not holiday");
                }
                else System.out.println("Day doesn't exist");
                break;
            case (4), (6),(8), (9), (10):
                if (day >= 1 & day <= 31) System.out.println("Not holiday");
                else System.out.println("Day doesn't exist");
                break;
            case (5):
                if (day >= 1 & day <= 31)
                {
                    if (day == 1 || day == 9) System.out.println("Holiday");
                    else System.out.println("Not holiday");
                }
                else System.out.println("Day doesn't exist");
                break;
            case (7):
                if (day >= 1 & day <= 31)
                {
                    if (day == 3) System.out.println("Holiday");
                    else System.out.println("Not holiday");
                }
                else System.out.println("Day doesn't exist");
                break;
            case (11):
                if (day >= 1 & day <= 31)
                {
                    if (day == 7) System.out.println("Holiday");
                    else System.out.println("Not holiday");
                }
                else System.out.println("Day doesn't exist");
                break;
            case (12):
                if (day >= 1 & day <= 31)
                {
                    if (day == 25) System.out.println("Holiday");
                    else System.out.println("Not holiday");
                }
                else System.out.println("Day doesn't exist");
                break;
            default:
                System.out.println("Month doesn't exist");
                break;
        }
    }
}
