package h3;

public class H3_main {

    public static void main(String[] args) {
        int max = 100, fix = 50, wartend = 80;
        boolean istVoll = false;

        System.out.println("Before:");
        System.out.println("Max " + max);
        System.out.println("Fix " + fix);
        System.out.println("Wartend " + wartend);
        System.out.println("IstVoll " + istVoll);
        System.out.println();

        if (max > fix) {
            int moveAmount = max - fix;
            if (moveAmount > wartend) {
                moveAmount = wartend;
            }
            wartend -= moveAmount;
            fix += moveAmount;

            System.out.println("MoveAmount " + moveAmount);
            System.out.println();
        }

        istVoll = fix == max;

        System.out.println("After:");
        System.out.println("Max " + max);
        System.out.println("Fix " + fix);
        System.out.println("Wartend " + wartend);
        System.out.println("IstVoll " + istVoll);
    }
}
