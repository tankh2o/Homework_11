import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int year = 2020;
        boolean yearLeap = isYearLeap(year);
        System.out.println("Год = " + year + " , результат = " + yearLeap);

        determineTypeOC(0, 2015);

        int distance = 40;
        int time = timeCounting(distance);
        System.out.println("Потребуется дней в количестве " + time + " для дистанции " + distance);

        }
        public static boolean isYearLeap(int year) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        public static void determineTypeOC(int type, int deviceYear) {
                int currentYear = LocalDate.now().getYear();
                if (type == 0) {
                    if (deviceYear < currentYear) {
                        System.out.println("ios, light");
                    } else {
                        System.out.println("ios, normal");
                    }
                } else if (type == 1) {
                    if (deviceYear < currentYear) {
                        System.out.println("android, light");
                    } else {
                        System.out.println("android, normal");
                    }
                }
            }
        public static int timeCounting (int distance) {
            if (distance <= 0 || distance > 100) {
                return -1;
            }
            int time = 1;
            if (distance >= 20) {
                ++time;
            }
            if (distance >= 60) {
                ++time;
            }
            return time;

        }
}


