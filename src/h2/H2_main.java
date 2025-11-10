package h2;

public class H2_main {

    public static void main(String[] args) {
        int jahr = 2000;
        boolean schalt = false;

        schalt = isLeapYear(jahr);
        System.out.println(jahr + " ist " + (schalt ? "" : "k") + "ein Schaltjahr");
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
